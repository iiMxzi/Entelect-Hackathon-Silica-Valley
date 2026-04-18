public class Tyre {
    private final String tire_compound;
    private final double friction_multiplier;
    private final double degredation_rate;

    public Tyre(String tireCompound, double frictionMultiplier, double degredationRate) {
        this.tire_compound = tireCompound;
        this.friction_multiplier = frictionMultiplier;
        this.degredation_rate = degredationRate;
    }

    public String getTireCompound() {
        return tire_compound;
    }

    public double getFrictionMultiplier() {
        return friction_multiplier;
    }

    public double getDegredationRate() {
        return degredation_rate;
    }
}
