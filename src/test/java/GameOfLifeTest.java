import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {

    private GameOfLife game = new GameOfLife();

    @Test
    void textAnyLiveCellWithFewerThanTwoNeighboursDies() {
        Boolean isAlive = game.isCellAlive(new Cell(), 1);
        Assertions.assertFalse(isAlive);
    }
}