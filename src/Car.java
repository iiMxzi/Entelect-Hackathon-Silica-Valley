public class Car {
    private final double max_speed_m_per_sec;
    private final double accel_m_per_sec2;
    private final double brake_m_per_sec2;// represents deceleration of the car
    private final double crawl_constant_m_per_sec;

    //TODO Complete documentation
    /**
     *
     * @param maxSpeed
     * @param accelMPerSec2
     * @param brakeMPerSec2
     * @param crawlConstantMPerSec
     */
    public Car(double maxSpeed,double accelMPerSec2, double brakeMPerSec2, double crawlConstantMPerSec) {
        this.max_speed_m_per_sec = maxSpeed;
        this.accel_m_per_sec2 = accelMPerSec2;
        this.brake_m_per_sec2 = brakeMPerSec2;
        this.crawl_constant_m_per_sec = crawlConstantMPerSec;
    }

    public double getMaxSpeed() {
        return max_speed_m_per_sec;
    }

    public double getAcceleration() {
        return accel_m_per_sec2;
    }

    public double getDeceleration() {
        return brake_m_per_sec2;
    }

    public double getCrawlConstant() {
        return crawl_constant_m_per_sec;
    }
}
