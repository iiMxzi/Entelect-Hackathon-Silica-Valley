public class Corner extends Segment{
    private final double radius;

    public Corner(int id, double length, String type, double radius) {
        super(id,length,type);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    //calculates the maximum speed needed to take a corner
    @Override
    public double getEntrySpeed(double friction, double crawlConstant) {
        double gravity = 9.8;
        return Math.sqrt(friction * gravity * this.radius) + crawlConstant;
    }
}
