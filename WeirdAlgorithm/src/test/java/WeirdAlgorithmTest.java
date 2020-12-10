import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeirdAlgorithmTest {

    @Test
    void testExecuteWeirdAlgorithm_1() {
        int val = 3;

        assertEquals("3 10 5 16 8 4 2 1", WeirdAlgorithm.executeWeirdAlgorithm(val));
    }

    @Test
    void testExecuteWeirdAlgorithm_2() {
        int val = 1;

        assertEquals("1", WeirdAlgorithm.executeWeirdAlgorithm(val));
    }
}