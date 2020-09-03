import java.util.Objects;

public class RoverPosition {
    private Orientation orientation;
    private Coordinate coordinate;

    public RoverPosition(Orientation orientation, Coordinate coordinate) {
        this.orientation = orientation;
        this.coordinate = coordinate;
    }

    static RoverPosition initial() {
        return new RoverPosition(Orientation.NORTH, new Coordinate(0,0));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RoverPosition that = (RoverPosition) o;
        return orientation == that.orientation &&
            Objects.equals(coordinate, that.coordinate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orientation, coordinate);
    }
}
