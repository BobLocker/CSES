package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TwoSetsTest {

    @Test
    void testGetTwoSets() {
        long value = 7;
        long sumAll = value * (value+1) / 2;

        List<Set<Integer>> result = TwoSets.getTwoSets(value);

        assertEquals(2, result.size());

        long sumFirst = result.get(0).stream()
                .mapToLong(x -> (long) x)
                .sum();

        long sumSecond = result.get(1).stream()
                .mapToLong(x -> (long) x)
                .sum();

        assertEquals(sumFirst, sumSecond);
        assertEquals(sumAll, sumFirst + sumSecond);
    }
}