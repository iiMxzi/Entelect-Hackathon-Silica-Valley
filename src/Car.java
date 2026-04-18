public class Car {

    // Basic Movement
    private final double max_speed_m_per_sec;
    private final double accel_m_per_sec2;
    private final double brake_m_per_sec2;

    // Safety Features
    private final double crawl_constant_m_per_sec;
    private final double limp_constant_m_per_sec;

    // Resources
    private final double fuel_tank_capacity_l;
    private final double initial_fuel_l;
    private final double fuel_consumption_l_per_m;

    public Car(double maxSpeed, double accelMPerSec2, double brakeMPerSec2,
               double crawlConstantMPerSec, double limpConstant,
               double fuelCapacity, double initialFuel, double fuelConsumption) {

        this.max_speed_m_per_sec = maxSpeed;
        this.accel_m_per_sec2 = accelMPerSec2;
        this.brake_m_per_sec2 = brakeMPerSec2;
        this.crawl_constant_m_per_sec = crawlConstantMPerSec;
        this.limp_constant_m_per_sec = limpConstant;
        this.fuel_tank_capacity_l = fuelCapacity;
        this.initial_fuel_l = initialFuel;
        this.fuel_consumption_l_per_m = fuelConsumption;
    }

    
    public double calculateCurrentFriction(double baseFriction, double totalDegradation, double weatherMultiplier) {
        return (baseFriction - totalDegradation) * weatherMultiplier;
    }

    
    public double calculateMaxCornerSpeed(double tyreFriction, double radiusM) {
        return Math.sqrt(tyreFriction * 9.8 * radiusM) + crawl_constant_m_per_sec;
    }

    public double calculateFuelUsed(double initialSpeed, double finalSpeed, double distanceM) {
        double avgSpeed = (initialSpeed + finalSpeed) / 2;
        return (0.0005 + 0.0000000015 * Math.pow(avgSpeed, 2)) * distanceM;
    }

    public double calculateDistanceForSpeedChange(double initialSpeed, double finalSpeed, double rate) {
        return (Math.pow(finalSpeed, 2) - Math.pow(initialSpeed, 2)) / (2 * rate);
    }

    public double calculateTimeForSpeedChange(double initialSpeed, double finalSpeed, double rate) {
        return Math.abs(finalSpeed - initialSpeed) / rate;
    }

    // Getters
    public double getMaxSpeed()          { return max_speed_m_per_sec; }
    public double getAcceleration()      { return accel_m_per_sec2; }
    public double getDeceleration()      { return brake_m_per_sec2; }
    public double getCrawlConstant()     { return crawl_constant_m_per_sec; }
    public double getLimpConstant()      { return limp_constant_m_per_sec; }
    public double getFuelTankCapacity()  { return fuel_tank_capacity_l; }
    public double getInitialFuel()       { return initial_fuel_l; }
    public double getFuelConsumption()   { return fuel_consumption_l_per_m; }
}
