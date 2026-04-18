public abstract class Segment {
    private final int id;
    private final double length;
    private final String type;

    public Segment(int id, double length, String type){
        this.id = id;
        this.length = length;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public double getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public abstract double getEntrySpeed(double friction, double crawlConstant);



}
