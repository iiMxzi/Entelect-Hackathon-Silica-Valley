public class Car {
    // Basic Movement
    private final double max_speed_m_per_sec;
    private final double accel_m_per_sec2;
    private final double brake_m_per_sec2;// represents deceleration of the car
    // Safety Features
    private final double crawl_constant_m_per_sec;
    private final double limp_constant_m_per_sec;
    // Resources
    private final double fuel_tank_capacity_l;
    private final double fuel_consumption_l_per_m;

    //TODO Complete documentation
    /**
     *
     * @param maxSpeed
     * @param accelMPerSec2
     * @param brakeMPerSec2
     * @param crawlConstantMPerSec
     */
    public Car(double maxSpeed,double accelMPerSec2, double brakeMPerSec2, double crawlConstantMPerSec, double limpConstant, double fuelCapacity, double fuelConsumption) {
        this.max_speed_m_per_sec = maxSpeed;
        this.accel_m_per_sec2 = accelMPerSec2;
        this.brake_m_per_sec2 = brakeMPerSec2;
        this.crawl_constant_m_per_sec = crawlConstantMPerSec;
        this.limp_constant_m_per_sec = limpConstant;
        this.fuel_tank_capacity_l = fuelCapacity;
        this.fuel_consumption_l_per_m = fuelConsumption;
    }

    /**
     * Calculates the grip available based on the current health of the tyre.
     * Formula: Friction_base * (Health^2)
     */
    public double calculateCurrentFriction(double baseFriction, double tyreHealth) {
        return baseFriction * Math.pow(tyreHealth, 2);
    }

    // Getters
    public double getMaxSpeed() { return max_speed_m_per_sec; }
    public double getAcceleration() { return accel_m_per_sec2; }
    public double getDeceleration() { return brake_m_per_sec2; }
    public double getCrawlConstant() { return crawl_constant_m_per_sec; }
    public double getLimpConstant() { return limp_constant_m_per_sec; }
    public double getFuelTankCapacity() { return fuel_tank_capacity_l; }
    public double getFuelConsumption() { return fuel_consumption_l_per_m; }
}
