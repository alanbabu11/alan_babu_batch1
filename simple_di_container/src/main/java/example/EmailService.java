package example;

/**
 * A concrete implementation of the MessageService.
 */
public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("EmailService: Sending email to " + receiver);
        System.out.println("Message: " + message);
        System.out.println("-------------------------------------------------");
    }
}
