public class Straight extends Segment{


    public Straight(int id, int length, String type) {
        super(id, length, type);
    }

    public double getEntrySpeed(double friction, double crawlConstant) {
        return 0;
    }
}
