import di.Container;
import example.EmailService;
import example.MessageService;
import example.NotificationManager;

public class Main {
    public static void main(String[] args) {
       
        System.out.println("Starting Simple Dependency Injection Demo");
        
        
        Container container = new Container();

      
        container.register(MessageService.class, EmailService.class);
        

        container.register(NotificationManager.class, NotificationManager.class);

        System.out.println("[+] Dependencies registered successfully.\n");


        System.out.println("[+] Resolving NotificationManager using the Container...");
        NotificationManager manager = container.resolve(NotificationManager.class);

        System.out.println("[+] Resolution complete. Testing the object:\n");

        manager.notifyUser("Hello! Welcome to the new platform.", "user@example.com");
    }
}
