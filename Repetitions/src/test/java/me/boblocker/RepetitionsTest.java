package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RepetitionsTest {

    @Test
    void testGetMaxRepetitions_1() {
        String DNA = "ATTCGGGA";

        assertEquals(3, Repetitions.getMaxRepetitions(DNA));
    }

    @Test
    void testGetMaxRepetitions_2() {
        String DNA = "G";

        assertEquals(1, Repetitions.getMaxRepetitions(DNA));
    }
}