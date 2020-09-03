import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RoverMoveSpec {
    @Test
    void should_go_forward() {
        final RoverPosition initial = RoverPosition.initial();
        final Coordinate coordinate = RoverMove.move("F", initial);
        Assertions.assertThat(coordinate).isEqualToComparingFieldByField(new Coordinate(0, 1));
    }
}
