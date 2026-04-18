public class Tyre {
    private final String tire_compound;
    private final double life_span;
    private final double friction_multiplier;
    private final double degredation_rate;

    public Tyre(String tireCompound, double lifeSpan, double frictionMultiplier, double degredationRate) {
        this.tire_compound = tireCompound;
        this.life_span = lifeSpan;
        this.friction_multiplier = frictionMultiplier;
        this.degredation_rate = degredationRate;
    }

    public String getTireCompound() {
        return tire_compound;
    }

    public double getLifeSpan() {
        return life_span;
    }

    public double getFrictionMultiplier() {
        return friction_multiplier;
    }

    public double getDegredationRate() {
        return degredation_rate;
    }
}
