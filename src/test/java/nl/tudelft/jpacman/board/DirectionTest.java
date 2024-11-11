package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

/**
 * A very simple (and not particularly useful)
 * test class to have a starting point where to put tests.
 *
 * Tests for the Direction class to verify correct directional deltas.
 * Each test checks if the direction returns the correct delta values.
 *
 * @see Direction
 */
public class DirectionTest {

    /**
     * Tests if the NORTH direction has the correct delta for the Y-axis.
     * The Y delta for NORTH should be -1.
     */
    @Test
    void testNorth() {
        Direction north = Direction.valueOf("NORTH");
        assertThat(north.getDeltaY()).isEqualTo(-1);
    }

    /**
     * Tests if the SOUTH direction has the correct delta for the Y-axis.
     * The Y delta for SOUTH should be 1.
     */
    @Test
    void testSouth() {
        Direction south = Direction.valueOf("SOUTH");
        assertThat(south.getDeltaY()).isEqualTo(1);
    }

    /**
     * Tests if the EAST direction has the correct delta for the X-axis.
     * The X delta for EAST should be 1.
     */
    @Test
    void testEast() {
        Direction east = Direction.valueOf("EAST");
        assertThat(east.getDeltaX()).isEqualTo(1);
    }

    /**
     * Tests if the WEST direction has the correct delta for the X-axis.
     * The X delta for WEST should be -1.
     */
    @Test
    void testWest() {
        Direction west = Direction.valueOf("WEST");
        assertThat(west.getDeltaX()).isEqualTo(-1);
    }
}
