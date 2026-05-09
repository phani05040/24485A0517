class Main {

    public static void main(String[] args) {

        Logger.Log(
                "backend",
                "info",
                "service",
                "Application started");

        Logger.Log(
                "backend",
                "debug",
                "controller",
                "Fetching all vehicles");

        Logger.Log(
                "backend",
                "warn",
                "repository",
                "Database response slow");

        Logger.Log(
                "backend",
                "error",
                "handler",
                "Invalid request body");

        Logger.Log(
                "backend",
                "fatal",
                "db",
                "Database connection failed");
    }
}