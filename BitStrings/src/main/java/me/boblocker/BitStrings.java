package me.boblocker;

import java.util.Scanner;

public class BitStrings {
    private static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long value = input.nextLong();
        long res = getNumberOfBitStrings(value);

        System.out.print(res);
    }

    public static long getNumberOfBitStrings(long value) {
        long result = 1;
        for (int i = 0; i < value; i ++) {
            result = (result * 2) % (MOD);
        }

        return result;
    }
}
