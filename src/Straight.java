public class Straight extends Segment{
    private final double target_speed;
    private final double braking_point;


    public Straight(int id, int length, String type, double tSpeed, double bPoint) {
        super(id, length, type);
        this.target_speed = tSpeed;
        this.braking_point = bPoint;
    }

    public double getTarget_speed() {
        return target_speed;
    }

    public double getBraking_point() {
        return braking_point;
    }

    public double getEntrySpeed(double friction, double crawlConstant) {
        return 0;
    }
}
