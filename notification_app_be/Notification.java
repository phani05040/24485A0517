class Notification {

    private int id;
    private String title;
    private String message;
    private boolean isRead;

    public Notification(
            int id,
            String title,
            String message) {

        this.id = id;
        this.title = title;
        this.message = message;
        this.isRead = false;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getMessage() {
        return message;
    }

    public boolean isRead() {
        return isRead;
    }

    public void markAsRead() {
        isRead = true;
    }

    public void display() {

        System.out.println(
                "\nID : " + id);

        System.out.println(
                "TITLE : " + title);

        System.out.println(
                "MESSAGE : " + message);

        System.out.println(
                "READ : " + isRead);
    }
}