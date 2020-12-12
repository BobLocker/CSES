package me.boblocker;

import java.util.Scanner;

public class TrailingZeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int result = getNumberOfTrailingZeros(value);

        System.out.print(result);
    }

    public static int getNumberOfTrailingZeros(int value) {
        int countOfFive = 0;

        while (value > 0) {
            countOfFive += value / 5;
            value /= 5;
        }

        return countOfFive;
    }
}
