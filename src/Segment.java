public abstract class Segment {
    private final int id, length;
    private final String type;

    public Segment(){}

    public Segment(int id, int length, String type) {
        this.id = id;
        this.length = length;
        this.type = type;
    }

    public abstract double getEntrySpeed(double friction, double crawlConstant);



}
