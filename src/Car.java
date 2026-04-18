public class Car {
    private double max_speed_m_per_sec;
    private final double ACCEL_M_PER_SEC2;
    private final double BRAKE_M_PER_SEC2;
    private final double CRAWL_CONSTANT_M_PER_SEC;

    //TODO Complete documentation
    /**
     *
     * @param mSpeed
     * @param accelMPerSec2
     * @param brakeMPerSec2
     * @param crawlConstantMPerSec
     */
    public Car(double mSpeed,double accelMPerSec2, double brakeMPerSec2, double crawlConstantMPerSec) {
        this.max_speed_m_per_sec = mSpeed;
        this.ACCEL_M_PER_SEC2 = accelMPerSec2;
        this.BRAKE_M_PER_SEC2 = brakeMPerSec2;
        this.CRAWL_CONSTANT_M_PER_SEC = crawlConstantMPerSec;
    }
    
}
