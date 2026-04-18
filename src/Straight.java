public class Straight extends Segment{
    private final double target_speed;
    private final double braking_point;


    public Straight(int id, double length, String type, double tSpeed, double bPoint) {
        super(id, length, type);
        this.target_speed = tSpeed;
        this.braking_point = bPoint;
    }

    public double getTargetSpeed() {
        return target_speed;
    }

    public double getBrakingPoint() {
        return braking_point;
    }
    //returns -1 since there is no entry speed for a staight
    public double getEntrySpeed(double friction, double crawlConstant) {
        return -1;
    }
}
