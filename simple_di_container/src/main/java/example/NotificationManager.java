package example;

/**
 * NotificationManager depends on a MessageService.
 * This dependency will be injected by the DI Container.
 */
public class NotificationManager {
    private final MessageService messageService;

    // The DI container will use this constructor and automatically
    // inject a suitable MessageService implementation.
    public NotificationManager(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message, String userEmail) {
        System.out.println("NotificationManager: Processing notification request...");
        messageService.sendMessage(message, userEmail);
    }
}
