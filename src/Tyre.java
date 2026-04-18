import java.util.HashMap;
import java.util.Map;

public class Tyre {
    private final String tire_compound;
    private final double life_span;
    // Maps to store weather-specific multipliers
    private final Map<String, Double> frictionMultipliers;
    private final Map<String, Double> degradationRates;


    public Tyre(String tireCompound, double lifeSpan) {
        this.tire_compound = tireCompound;
        this.life_span = lifeSpan;
        this.frictionMultipliers = new HashMap<>();
        this.degradationRates = new HashMap<>();
    }

    // Getters
    public String getTireCompound() { return tire_compound; }
    public double getLifeSpan() {return life_span; }

    /**
     * Adds a friction multiplier for a specific weather condition.
     * Use keys like "dry", "cold", "light_rain", "heavy_rain"
     */
    public void addFrictionMultiplier(String condition, double multiplier) {
        frictionMultipliers.put(condition, multiplier);
    }

    /**
     * Adds a degradation rate for a specific weather condition.
     */
    public void addDegradationRate(String condition, double rate) {
        degradationRates.put(condition, rate);
    }

    /**
     * Retrieves the friction multiplier for the current weather.
     * Returns 1.0 as a safe default if the condition isn't found.
     */
    public double getFrictionForCondition(String condition) {
        return frictionMultipliers.getOrDefault(condition, 1.0);
    }

    /**
     * Retrieves the degradation rate for the current weather.
     */
    public double getDegradationForCondition(String condition) {
        return degradationRates.getOrDefault(condition, 0.1);
    }
}
