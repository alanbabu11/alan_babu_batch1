package di;

/**
 * Custom runtime exception used by the Dependency Injection Container
 * when it fails to resolve or instantiate a dependency.
 */
public class DependencyException extends RuntimeException {
    public DependencyException(String message) {
        super(message);
    }

    public DependencyException(String message, Throwable cause) {
        super(message, cause);
    }
}
