public class RaceState {
    private double total_time;
    private double current_speed;
    private int current_lap;
    private double fuel_remaining;
    private double tyre_health; // 100%
    private boolean isLimpMode;
    private boolean isCrawlMode;


    public RaceState(double total_time, double current_speed, int current_lap, double fuel_remaining) {
        this.total_time = total_time;
        this.current_speed = current_speed;
        this.current_lap = current_lap;
        this.fuel_remaining = fuel_remaining;
        this.tyre_health = 1.0;
        this.isCrawlMode = false;
        this.isLimpMode = false;
    }

    public double getTotalTime() {
        return total_time;
    }

    public double getCurrentSpeed() {
        return current_speed;
    }

    public int getCurrentLap() {
        return current_lap;
    }

    public double getFuelRemaining() {
        return fuel_remaining;
    }

    public double getTyreHealth() {
        return tyre_health;
    }

    public boolean isLimpMode() {
        return isLimpMode;
    }

    public boolean isCrawlMode() {
        return isCrawlMode;
    }

}
