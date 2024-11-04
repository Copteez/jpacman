package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class BoardTest {
    private static final int MAX_WIDTH = 1;
    private static final int MAX_HEIGHT = 1;

    private final Square[][] grid = {
        { mock(Square.class), mock(Square.class), mock(Square.class) },
        { mock(Square.class), mock(Square.class), mock(Square.class) },
    };
    private final Board board = new Board(grid);
    private final Board board2 = new Board(grid);

    @Test
    void testSquareInBoard() {
        Unit unit = new BasicUnit();
        board.squareAt(1,1).put(unit);
        System.out.println(board.squareAt(1,1).getOccupants());
        assertThat(board.invariant()).isTrue();
    }
    @Test
    void testNullInBoard() {
        System.out.println(board2.squareAt(1,1).getOccupants());
        assertThat(board2.invariant()).isTrue();
    }
}
