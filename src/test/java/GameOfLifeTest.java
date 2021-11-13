import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {


    private GameOfLife game = new GameOfLife();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void textAnyLiveCellWithFewerThanTwoLiveNeighboursDies() {
        var isAlive = game.isCellAlive(new Cell(), 1);
        Assertions.assertFalse(isAlive);
    }
}