import java.util.ArrayList;

class NotificationService {

    private NotificationRepository
            repository =
            new NotificationRepository();

    public void sendNotification(
            Notification notification) {

        repository.save(notification);

        Logger.Log(
                "backend",
                "info",
                "service",
                "Notification sent successfully");
    }

    public void showNotifications() {

        ArrayList<Notification>
                notifications =
                repository.getAllNotifications();

        for (Notification n
                : notifications) {

            n.display();
        }
    }

    public void markNotificationAsRead(
            int id) {

        ArrayList<Notification>
                notifications =
                repository.getAllNotifications();

        for (Notification n
                : notifications) {

            if (n.getId() == id) {

                n.markAsRead();

                Logger.Log(
                        "backend",
                        "info",
                        "service",
                        "Notification marked as read");
            }
        }
    }
}