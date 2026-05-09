import java.util.ArrayList;

class SchedulerService {

    public void optimizeTasks(
            Depot depot,
            ArrayList<VehicleTask> tasks) {

        int n = tasks.size();

        int capacity =
                depot.getMechanicHours();

        int[][] dp =
                new int[n + 1][capacity + 1];

        for (int i = 1; i <= n; i++) {

            VehicleTask task =
                    tasks.get(i - 1);

            for (int w = 1;
                 w <= capacity;
                 w++) {

                if (task.getDuration() <= w) {

                    dp[i][w] =
                            Math.max(
                                    task.getImpact()
                                            + dp[i - 1]
                                            [w - task.getDuration()],
                                    dp[i - 1][w]);
                }
                else {

                    dp[i][w] =
                            dp[i - 1][w];
                }
            }
        }

        Logger.Log(
                "backend",
                "info",
                "service",
                "Optimization completed");

        System.out.println(
                "\nDEPOT ID : "
                        + depot.getId());

        System.out.println(
                "MECHANIC HOURS : "
                        + capacity);

        System.out.println(
                "MAXIMUM IMPACT : "
                        + dp[n][capacity]);
    }
}