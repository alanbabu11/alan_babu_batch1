package di;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;


public class Container {

    private final Map<Class<?>, Class<?>> registry = new HashMap<>();
    

    private final Map<Class<?>, Object> instances = new HashMap<>();


    public <T> void register(Class<T> baseClass, Class<? extends T> implClass) {
        registry.put(baseClass, implClass);
    }


    public <T> void registerInstance(Class<T> baseClass, T instance) {
        instances.put(baseClass, instance);
    }


    @SuppressWarnings("unchecked")
    public <T> T resolve(Class<T> type) {

        if (instances.containsKey(type)) {
            return (T) instances.get(type);
        }


        Class<?> implClass = registry.getOrDefault(type, type);

        try {
            Constructor<?>[] constructors = implClass.getConstructors();
            

            if (constructors.length == 0) {
                return (T) implClass.getDeclaredConstructor().newInstance();
            }


            Constructor<?> constructor = constructors[0];
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            Object[] parameters = new Object[parameterTypes.length];


            for (int i = 0; i < parameterTypes.length; i++) {
                parameters[i] = resolve(parameterTypes[i]);
            }


            T instance = (T) constructor.newInstance(parameters);
            

            instances.put(type, instance);
            
            return instance;
        } catch (Exception e) {
            throw new DependencyException("Failed to resolve dependency for " + type.getName() + " -> " + implClass.getName(), e);
        }
    }
}
