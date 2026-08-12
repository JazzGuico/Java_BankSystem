package Bank;

public class EmailNotificationService implements NotificationService {
    @Override
    public void sendNotification(String accountHolder, String message) {
        // Simulate sending an email notification
        System.out.println("Sending email to " + accountHolder + ": " + message);
    }
}
