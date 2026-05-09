import java.util.ArrayList;

class DepotService {

    public ArrayList<Depot> getDepots() {

        Logger.Log(
                "backend",
                "info",
                "service",
                "Fetching depots");

        ArrayList<Depot> depots =
                new ArrayList<>();

        depots.add(
                new Depot(1, 60));

        depots.add(
                new Depot(2, 80));

        depots.add(
                new Depot(3, 120));

        return depots;
    }
}