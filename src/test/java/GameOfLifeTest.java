import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;git add .
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameOfLifeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void aLivingCellWith0AdjacentCellsShouldDie() {
        boolean currentCellState = true;
        boolean newCellState = LifeProcessor.calculate(currentCellState, 0);
        assertFalse(newCellState);
    }
}