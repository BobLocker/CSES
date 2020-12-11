package me.boblocker;

import java.util.Arrays;
import java.util.Scanner;

public class IncreasingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count  = Integer.parseInt(input.nextLine());
        int[] values = Arrays.stream(input.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        long result = getMinimumNumOfTurn(count, values);

        System.out.println(result);
    }

    public static long getMinimumNumOfTurn(int count, int[] values) {
        long result = 0;

        for (int i = 0; i < count-1; i++) {
            if (values[i + 1] < values[i]) {
                result += values[i] - values[i + 1];
                values[i + 1] = values[i];
            }
        }

        return result;
    }
}
