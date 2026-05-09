class NotificationController {

    private NotificationService
            service =
            new NotificationService();

    public void createNotification(
            int id,
            String title,
            String message) {

        Notification notification =
                new Notification(
                        id,
                        title,
                        message);

        service.sendNotification(
                notification);
    }

    public void getNotifications() {

        service.showNotifications();
    }

    public void readNotification(
            int id) {

        service.markNotificationAsRead(
                id);
    }
}