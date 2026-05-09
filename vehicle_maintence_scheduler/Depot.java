class Depot {

    private int id;
    private int mechanicHours;

    public Depot(
            int id,
            int mechanicHours) {

        this.id = id;
        this.mechanicHours = mechanicHours;
    }

    public int getId() {
        return id;
    }

    public int getMechanicHours() {
        return mechanicHours;
    }
}