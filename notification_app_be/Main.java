class Main {

    public static void main(String[] args) {

        NotificationController controller =
                new NotificationController();

        controller.createNotification(
                1,
                "Vehicle Maintenance",
                "Vehicle service scheduled tomorrow");

        controller.createNotification(
                2,
                "Payment",
                "Payment completed successfully");

        System.out.println(
                "\nALL NOTIFICATIONS");

        controller.getNotifications();

        controller.readNotification(1);

        System.out.println(
                "\nAFTER MARK AS READ");

        controller.getNotifications();
    }
}