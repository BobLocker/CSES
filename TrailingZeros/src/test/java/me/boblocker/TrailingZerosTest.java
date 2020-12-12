package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrailingZerosTest {

    @Test
    void testGetNumberOfTrailingZeros() {
        int value = 20;

        assertEquals(4, TrailingZeros.getNumberOfTrailingZeros(value));
    }
}