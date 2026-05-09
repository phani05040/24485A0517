import java.util.ArrayList;

class SchedulerController {

    private DepotService depotService =
            new DepotService();

    private VehicleTaskService taskService =
            new VehicleTaskService();

    private SchedulerService schedulerService =
            new SchedulerService();

    public void runScheduler() {

        ArrayList<Depot> depots =
                depotService.getDepots();

        ArrayList<VehicleTask> tasks =
                taskService.getTasks();

        for (Depot depot : depots) {

            schedulerService.optimizeTasks(
                    depot,
                    tasks);
        }
    }
}