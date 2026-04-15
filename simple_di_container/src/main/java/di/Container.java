package di;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple Dependency Injection Container.
 * It provides basic constructor-based dependency injection.
 */
public class Container {
    // Stores mappings of Base Type/Interface -> Implementation Class
    private final Map<Class<?>, Class<?>> registry = new HashMap<>();
    
    // Stores singleton instances
    private final Map<Class<?>, Object> instances = new HashMap<>();

    /**
     * Map an interface/base class to its implementation type.
     */
    public <T> void register(Class<T> baseClass, Class<? extends T> implClass) {
        registry.put(baseClass, implClass);
    }

    /**
     * Directly register a pre-instantiated singleton object.
     */
    public <T> void registerInstance(Class<T> baseClass, T instance) {
        instances.put(baseClass, instance);
    }

    /**
     * Resolves an instance of the requested type, automatically
     * injecting any constructor dependencies.
     */
    @SuppressWarnings("unchecked")
    public <T> T resolve(Class<T> type) {
        // Return existing singleton if we already instantiated it
        if (instances.containsKey(type)) {
            return (T) instances.get(type);
        }

        // Check if we have a registered implementation for this type
        Class<?> implClass = registry.getOrDefault(type, type);

        try {
            Constructor<?>[] constructors = implClass.getConstructors();
            
            // If there's no public constructor or just a default one
            if (constructors.length == 0) {
                return (T) implClass.getDeclaredConstructor().newInstance();
            }

            // For simplicity, we just use the first available constructor
            Constructor<?> constructor = constructors[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameters = new Object[parameterTypes.length];

            // Recursively resolve dependencies
            for (int i = 0; i < parameterTypes.length; i++) {
                parameters[i] = resolve(parameterTypes[i]);
            }

            // Create the new instance
            T instance = (T) constructor.newInstance(parameters);
            
            // Register it as a singleton so it's reused
            instances.put(type, instance);
            
            return instance;
        } catch (Exception e) {
            throw new DependencyException("Failed to resolve dependency for " + type.getName() + " -> " + implClass.getName(), e);
        }
    }
}
