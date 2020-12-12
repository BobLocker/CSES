package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CoinPilesTest {

    @Test
    void testCanEmpty() {
        assertTrue(CoinPiles.canEmpty(2, 1));
        assertFalse(CoinPiles.canEmpty(2, 2));
        assertTrue(CoinPiles.canEmpty(3, 3));
    }
}