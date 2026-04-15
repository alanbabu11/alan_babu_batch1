package example;


public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("EmailService: Sending email to " + receiver);
        System.out.println("Message: " + message);
    
    }
}
