package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

/***
* This is the test for board.
*/
public class BoardTest {
    // Constants for maximum width and height of the board
    private static final int MAX_WIDTH = 1;
    private static final int MAX_HEIGHT = 1;

    // 2D grid of mocked Square objects to simulate the board's layout
    private final Square[][] grid = {
        { mock(Square.class), mock(Square.class), mock(Square.class) },
        { mock(Square.class), mock(Square.class), mock(Square.class) },
    };
    // Initializing two Board objects with the same grid layout
    private final Board board = new Board(grid);
    private final Board board2 = new Board(grid);

        /***
     * Tests if a Unit can be added to a Square on the board
     * and checks if the board's invariant holds.
     */
    
    @Test
    void testSquareInBoard() {
        // Create a new BasicUnit to place on the board
        Unit unit = new BasicUnit();
        // Place the unit on the square at position (1,1) in the board    
        board.squareAt(1,1).put(unit);
        // Print the occupants of the square at position (1,1) for verification
        System.out.println(board.squareAt(1,1).getOccupants());
         // Assert that the board's invariant is maintained
        assertThat(board.invariant()).isTrue();
    }
        /***
     * Tests if a Square without a unit in it still maintains the board's invariant.
     */
    
    @Test
    void testNullInBoard() {
        // Print the occupants of the square at position (1,1) for verification
        System.out.println(board2.squareAt(1,1).getOccupants());
        // Assert that the board's invariant is maintained
        assertThat(board2.invariant()).isTrue();
    }
}
