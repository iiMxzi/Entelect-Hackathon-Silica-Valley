import java.util.ArrayList;
import java.util.List;

public class Track {
    private final String name;
    private final List<Segment> segments;

    public Track(String name) {
        this.name = name;
        this.segments = new ArrayList<>();
    }

    public void addSegment(Segment segment) {
        this.segments.add(segment);
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public Segment getNextSegment(int currentIndex) {
        if(currentIndex + 1 < segments.size()) {
            return segments.get(currentIndex + 1);
        }
        return segments.get(0);
    }
}
