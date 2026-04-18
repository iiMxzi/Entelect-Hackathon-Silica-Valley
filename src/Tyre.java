public class Tyre {
    private final String tire_compound;
    private final double friction_multiplier;
    private final double degredation_rate;

    public Tyre(String tireCompound, double frictionMultiplier, double degredationRate) {
        this.tire_compound = tireCompound;
        this.friction_multiplier = frictionMultiplier;
        this.degredation_rate = degredationRate;
    }

    public String getTire_compound() {
        return tire_compound;
    }

    public double getFriction_multiplier() {
        return friction_multiplier;
    }

    public double getDegredation_rate() {
        return degredation_rate;
    }
}
