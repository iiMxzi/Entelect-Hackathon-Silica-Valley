import java.util.ArrayList;
import java.util.List;

public class WeatherTimeLine {
    private final List<WeatherCondition> conditions;

    public WeatherTimeLine() {
        this.conditions = new ArrayList<>();
    }

    public void addCondition(WeatherCondition wc) {
        this.conditions.add(wc);
    }
    /**
     * Finds the active weather condition at a specific point in the race.
     * @param totalRaceTime The cumulative time elapsed in the race.
     */
    public WeatherCondition getConditionAtTime(double totalRaceTime) {
        double cumulativeTime = 0;
        for (WeatherCondition wc : conditions) {
            cumulativeTime += wc.getDuration();
            if (totalRaceTime <= cumulativeTime) {
                return wc;
            }
        }
        // Return the last known condition if the race exceeds the timeline
        return conditions.get(conditions.size() - 1);
    }
}
