package me.boblocker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PermutationsTest {
    private final String NO_SOLUTION = "NO SOLUTION";

    @Test
    void testGetBeautifulPermutation() {
        int value = 5;

        assertEquals("2 4 1 3 5", Permutations.getBeautifulPermutation(value));
    }

    @Test
    void testGetBeautifulPermutation_ReturnNoSolution() {
        int value = 3;

        assertEquals(NO_SOLUTION, Permutations.getBeautifulPermutation(value));
    }
}