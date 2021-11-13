import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    private GameOfLife game = new GameOfLife();

    @Test
    void testAnyLiveCellWithFewerThanTwoNeighboursDies() {
        Boolean isAlive = game.isCellAlive(new Cell(), 1);
        Assertions.assertFalse(isAlive);
    }

    //Any live cell with two or three live neighbours lives on to the next generation.
    @Test
    void testAnyLiveCellWithTwoNeighboursLives() {
        Boolean isAlive = game.isCellAlive(new Cell(), 2);
        Assertions.assertTrue(isAlive);
    }
}