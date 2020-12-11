package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberSpiralTest {

    @Test
    void testGetNumber_y2x3_Return8() {
        long y = 2;
        long x = 3;

        assertEquals(8, NumberSpiral.getNumber(y, x));
    }

    @Test
    void testGetNumber_y1x1_Return1() {
        long y = 1;
        long x = 1;

        assertEquals(1, NumberSpiral.getNumber(y, x));
    }

    @Test
    void testGetNumber_y4x2_Return15() {
        long y = 4;
        long x = 2;

        assertEquals(15, NumberSpiral.getNumber(y, x));
    }
}