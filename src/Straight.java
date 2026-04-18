public class Straight extends Segment{

    /**
     * @param id The segment ID from JSON
     * @param length Total length in meters
     * @param type Will be "straight"
     */
    public Straight(int id, double length, String type) {
        super(id, length, type);
    }

    /**
     * Straights do not have a physical grip limit like corners.
     * We return -1 to signal to the Simulator that the only limit is the Car's max speed.
     */
    @Override
    public double getEntrySpeed(double friction, double crawlConstant) {
        return -1;
    }
}
