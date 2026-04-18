public class Car {
    private final double max_speed_m_per_sec;
    private final double accel_m_per_sec2;
    private final double brake_m_er_sec2;
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
        this.brake_m_er_sec2 = brakeMPerSec2;
        this.crawl_constant_m_per_sec = crawlConstantMPerSec;
    }

    public double getMax_speed_m_per_sec() {
        return max_speed_m_per_sec;
    }

    public double getAccel_m_per_sec2() {
        return accel_m_per_sec2;
    }

    public double getBrake_m_er_sec2() {
        return brake_m_er_sec2;
    }

    public double getCrawl_constant_m_per_sec() {
        return crawl_constant_m_per_sec;
    }
}
