public class WeatherCondition {
    private final int id;
    private final String condition;
    private final double duration;
    private final double accel_multiplier;
    private final double decel_multiplier;

    public WeatherCondition(int id, String condition, double duration, double accelMult, double decelMult) {
        this.id = id;
        this.condition = condition;
        this.duration = duration;
        this.accel_multiplier = accelMult;
        this.decel_multiplier = decelMult;
    }

    // Getters
    public int getId() { return id; }
    public String getCondition() { return condition; }
    public double getDuration() { return duration; }
    public double getAccelMultiplier() { return accel_multiplier; }
    public double getDecelMultiplier() { return decel_multiplier; }
}
