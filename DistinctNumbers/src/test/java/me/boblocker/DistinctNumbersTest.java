package me.boblocker;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DistinctNumbersTest {

    @Test
    void testGetNumberOfDistinctValues() throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = sb.append("5").append(System.lineSeparator())
                .append("2 3 2 2 3")
                .toString().getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        assertEquals(2, DistinctNumbers.getNumberOfDistinctValues(inputStream));
    }
}