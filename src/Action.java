public class Action {
    private final double target_speed;
    private final double brake_start;
    private final int type_id;

    public Action(double target_speed, double brake_start, int type_id) {
        this.target_speed = target_speed;
        this.brake_start = brake_start;
        this.type_id = type_id;
    }

    public double getTargetSpeed() {
        return target_speed;
    }

    public double getBrakeStart() {
        return brake_start;
    }

    public int getTypeID() {
        return type_id;
    }

}
