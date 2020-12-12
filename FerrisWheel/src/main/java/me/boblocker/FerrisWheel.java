package me.boblocker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FerrisWheel {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader(System.in);
        int childrenCount = reader.nextInt();
        int maxWeight = reader.nextInt();
        List<Integer> childrenWeights = new ArrayList<>();

        for (int i = 0; i < childrenCount; i++) {
            childrenWeights.add(reader.nextInt());
        }

        int result = getMinGondolasCount(maxWeight, childrenWeights);

        System.out.println(result);
    }

    public static int getMinGondolasCount(int maxWeight, List<Integer> childrenWeights) {
        childrenWeights.sort(Integer::compareTo);
        int result = 0;

        for (int i = 0, j = childrenWeights.size() - 1; i <= j; ) {
            int weight = childrenWeights.get(j);
            if (weight != maxWeight && weight + childrenWeights.get(i) <= maxWeight) {
                i++;
            }
            j--;
            result++;
        }

        return result;
    }
}
