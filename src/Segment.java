public abstract class Segment {
    private final int id;
    private final int length;
    private final String type;

    public Segment(int id, int length, String type){
        this.id = id;
        this.length = length;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public abstract double getEntrySpeed(double friction, double crawlConstant);



}
