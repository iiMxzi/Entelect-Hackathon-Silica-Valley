public class Tyre {
    private final String tireCompound;
    private final double frictionMultiplier;

    public Tyre(String tireCompound, double frictionMultiplier) {
        this.tireCompound = tireCompound;
        this.frictionMultiplier = frictionMultiplier;
    }

    public String getTireCompound() {
        return tireCompound;
    }

    public double getFrictionMultiplier() {
        return frictionMultiplier;
    }
}
