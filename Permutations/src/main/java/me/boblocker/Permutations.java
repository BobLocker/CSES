package me.boblocker;

import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        String result = getBeautifulPermutation(value);

        System.out.println(result);
    }

    public static String getBeautifulPermutation(int value) {
        StringBuilder sb = new StringBuilder();
        if (value == 1) {
            return "1";
        }
        if (value > 1 && value < 4) {
            return "NO SOLUTION";
        }

        for (int i = 2; i <= value; i+=2)
            sb.append(i).append(" ");

        for (int i = 1; i <= value; i+=2)
            sb.append(i).append(" ");

        return sb.toString().strip();
    }
}
