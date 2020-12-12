package me.boblocker;

import java.util.*;

public class TwoSets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long value = input.nextLong();
        long sum = value * (value+1) / 2;

        if (sum % 2 != 0) {
            System.out.println("NO");
            return;
        }

        List<Set<Integer>> sets = getTwoSets(value);
        System.out.println("YES");
        System.out.println(sets.get(0).size());
        Utils.printIterable(sets.get(0));
        System.out.println("\n" + sets.get(1).size());
        Utils.printIterable(sets.get(1));
    }

    public static List<Set<Integer>> getTwoSets(long value) {
        List<Set<Integer>> result = new ArrayList<>();
        Set<Integer> firstSet = new HashSet<>();
        Set<Integer> secondSet = new HashSet<>();

        long sum = value * (value+1) / 2;
        long currentSum = sum/2;
        long currentValue = value;

        while (currentSum >= 0) {
            if (currentSum <= currentValue) {
                firstSet.add((int)currentSum);
                break;
            }
            firstSet.add((int)currentValue);
            currentSum -= currentValue;
            currentValue--;
        }

        for (int i =1; i <= currentValue; i++) {
            if (i != currentSum)
                secondSet.add(i);
        }

        result.add(firstSet);
        result.add(secondSet);

        return result;
    }
}
