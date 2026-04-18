public class RaceState {
    private double total_time;
    private double current_speed;
    private int current_lap;
    private double fuel_remaining;

    public RaceState(double total_time, double current_speed, int current_lap, double fuel_remaining) {
        this.total_time = total_time;
        this.current_speed = current_speed;
        this.current_lap = current_lap;
        this.fuel_remaining = fuel_remaining;
    }

    public double getTotal_time() {
        return total_time;
    }

    public double getCurrent_speed() {
        return current_speed;
    }

    public int getCurrent_lap() {
        return current_lap;
    }

    public double getFuel_remaining() {
        return fuel_remaining;
    }

}
