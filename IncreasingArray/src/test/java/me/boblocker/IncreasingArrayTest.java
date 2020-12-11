package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncreasingArrayTest {

    @Test
    void getMinimumNumOfTurn() {
        int count = 5;
        int[] values = {3, 2, 5, 1, 7};

        assertEquals(5, IncreasingArray.getMinimumNumOfTurn(count, values));
    }
}