import java.util.ArrayList;

class VehicleTaskService {

    public ArrayList<VehicleTask>
    getTasks() {

        Logger.Log(
                "backend",
                "info",
                "service",
                "Fetching vehicle tasks");

        ArrayList<VehicleTask> tasks =
                new ArrayList<>();

        tasks.add(
                new VehicleTask(
                        "TASK-1",
                        10,
                        60));

        tasks.add(
                new VehicleTask(
                        "TASK-2",
                        20,
                        100));

        tasks.add(
                new VehicleTask(
                        "TASK-3",
                        30,
                        120));

        tasks.add(
                new VehicleTask(
                        "TASK-4",
                        25,
                        75));

        tasks.add(
                new VehicleTask(
                        "TASK-5",
                        15,
                        50));

        return tasks;
    }
}