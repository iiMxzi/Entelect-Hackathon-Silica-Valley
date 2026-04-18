import java.util.ArrayList;
import java.util.List;

public class Track {
    private final String name;
    private final List<Segment> segments;

    public Track(String name) {
        this.name = name;
        this.segments = new ArrayList<>();
    }

    /**
     * Adds a segment (Straight or Corner) to the track layout.
     */
    public void addSegment(Segment segment) {
        this.segments.add(segment);
    }

    public List<Segment> getSegments() { return segments; }

    public int getSementCount() { return segments.size(); }

    /**
     * Retrieves the segment following the current one.
     * If the current segment is the last one, it returns the first segment
     * (representing the start of a new lap).
     */
    public Segment getNextSegment(int currentIndex) {
        if (segments.isEmpty()) return null;

        int nextIndex = (currentIndex + 1) % segments.size();
        return segments.get(nextIndex);
    }
}
