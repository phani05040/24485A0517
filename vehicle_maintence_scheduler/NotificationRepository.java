import java.util.ArrayList;

class NotificationRepository {

    private ArrayList<Notification>
            notifications =
            new ArrayList<>();

    public void save(
            Notification notification) {

        notifications.add(notification);

        Logger.Log(
                "backend",
                "info",
                "repository",
                "Notification stored");
    }

    public ArrayList<Notification>
    getAllNotifications() {

        return notifications;
    }
}