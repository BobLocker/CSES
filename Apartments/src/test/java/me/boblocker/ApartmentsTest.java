package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ApartmentsTest {

    @Test
    void testGetOccupiedApartmentsCount() {
        int maxDifference = 5;
        List<Integer> desiredSizes = Arrays.asList(60, 45, 80, 60);
        List<Integer> sizes = Arrays.asList(30, 60, 75);

        assertEquals(2, Apartments.getOccupiedApartmentsCount(maxDifference, desiredSizes, sizes));
    }
}