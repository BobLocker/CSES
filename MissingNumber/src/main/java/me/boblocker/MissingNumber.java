package me.boblocker;

import java.io.IOException;
import java.io.InputStream;

public class MissingNumber {
    public static void main(String[] args) throws IOException {
        int result = findMissingNumber(System.in);

        System.out.println(result);
    }

    public static int findMissingNumber(InputStream inputStream) throws IOException {
        Reader reader = new Reader(inputStream);
        long n = reader.nextInt();
        long sum = n * (n+1) / 2;
        for (int i=0; i < n-1; i++ ) {
            sum -= reader.nextInt();
        }

        return (int) sum;
    }
}
