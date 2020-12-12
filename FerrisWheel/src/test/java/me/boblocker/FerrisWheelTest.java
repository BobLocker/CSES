package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FerrisWheelTest {

    @Test
    void testGetMinGondolasCount() {
        int maxWeight = 10;
        List<Integer> childrenWeights = Arrays.asList(7, 2, 3, 9);

        assertEquals(3, FerrisWheel.getMinGondolasCount(maxWeight, childrenWeights));
    }
}