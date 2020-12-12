package me.boblocker;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Set;

public class DistinctNumbers {
    public static void main(String[] args) throws IOException {
        int result = getNumberOfDistinctValues(System.in);

        System.out.print(result);
    }

    public static int getNumberOfDistinctValues(InputStream inputStream) throws IOException {
        Reader reader = new Reader(inputStream);
        Set<Integer> set = new HashSet<>();
        int count = reader.nextInt();

        for (int i = 0; i < count; i++) {
            set.add(reader.nextInt());
        }

        return set.size();
    }
}
