import di.Container;
import example.EmailService;
import example.MessageService;
import example.NotificationManager;

public class Main {
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("Starting Simple Dependency Injection Demo");
        System.out.println("=========================================\n");

        // 1. Initialize our Container
        Container container = new Container();

        // 2. Register classes/interfaces
        // When MessageService is requested, provide EmailService
        container.register(MessageService.class, EmailService.class);
        
        // This is optional if the class has a concrete implementation and isn't an interface
        // But registering it makes it explicit.
        container.register(NotificationManager.class, NotificationManager.class);

        System.out.println("[+] Dependencies registered successfully.\n");

        // 3. Resolve the object and its dependencies
        System.out.println("[+] Resolving NotificationManager using the Container...");
        NotificationManager manager = container.resolve(NotificationManager.class);

        System.out.println("[+] Resolution complete. Testing the object:\n");
        // 4. Use the fully configured object
        manager.notifyUser("Hello! Welcome to the new platform.", "user@example.com");
    }
}
