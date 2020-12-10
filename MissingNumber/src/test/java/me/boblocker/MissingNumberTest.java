package me.boblocker;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    @Test
    public void testFindMissingNumber_nIs5() throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = sb.append("5").append(System.lineSeparator())
                .append("2 3 1 5")
                .toString().getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);
        int missingNumber = MissingNumber.findMissingNumber(inputStream);
        assertEquals(4, missingNumber);
    }

    @Test
    public void testFindMissingNumber_nIs1000000() throws IOException {
        String resourceName = "test_input.txt";
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(resourceName);
        int missingNumber = MissingNumber.findMissingNumber(inputStream);

        assertEquals(6727, missingNumber);
    }
}