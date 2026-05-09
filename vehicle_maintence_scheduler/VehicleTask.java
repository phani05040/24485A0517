class VehicleTask {

    private String taskId;
    private int duration;
    private int impact;

    public VehicleTask(
            String taskId,
            int duration,
            int impact) {

        this.taskId = taskId;
        this.duration = duration;
        this.impact = impact;
    }

    public String getTaskId() {
        return taskId;
    }

    public int getDuration() {
        return duration;
    }

    public int getImpact() {
        return impact;
    }
}