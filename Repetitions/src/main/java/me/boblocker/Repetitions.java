package me.boblocker;

import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String DNA = input.nextLine();

        int max = getMaxRepetitions(DNA);

        System.out.println(max);
    }

    public static int getMaxRepetitions(String s) {
        int max = 1;
        int current = 0;
        char currentChar = s.charAt(0);

        for (char c : s.toCharArray()) {
            if (currentChar == c) {
                max = Math.max(max, ++current);
            } else {
                currentChar = c;
                current = 1;
            }
        }

        return max;
    }
}
