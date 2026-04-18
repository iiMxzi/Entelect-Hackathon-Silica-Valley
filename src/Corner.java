public class Corner extends Segment{
    private final double radius;

    public Corner(int id, int length, String type, double radius) {
        super(id,length,type);
        this.radius = radius;
    }

    @Override
    public double getEntrySpeed(double friction, double crawlConstant) {
        return 0;
    }
}
