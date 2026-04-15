package example;


public class NotificationManager {
    private final MessageService messageService;


    public NotificationManager(MessageService messageService) {
        this.messageService = messageService;
    }

    public void notifyUser(String message, String userEmail) {
        System.out.println("NotificationManager: Processing notification request...");
        messageService.sendMessage(message, userEmail);
    }
}
