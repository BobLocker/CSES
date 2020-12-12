package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BitStringsTest {

    @Test
    void testGetNumberOfBitStrings() {
        long value = 3L;

        assertEquals(8, BitStrings.getNumberOfBitStrings(value));
    }
}