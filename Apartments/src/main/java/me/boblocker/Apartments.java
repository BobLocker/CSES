package me.boblocker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Apartments {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader(System.in);
        int applicantsCount = reader.nextInt();
        int apartmentsCount = reader.nextInt();
        int maxDifference = reader.nextInt();

        List<Integer> desiredSizes = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        for (int i = 0; i < applicantsCount; i++) {
            desiredSizes.add(reader.nextInt());
        }
        for (int i = 0; i < apartmentsCount; i++) {
            sizes.add(reader.nextInt());
        }

        int result = getOccupiedApartmentsCount(maxDifference, desiredSizes, sizes);

        System.out.print(result);
    }

    public static int getOccupiedApartmentsCount(int maxDifference, List<Integer> desiredSizes, List<Integer> sizes) {
        desiredSizes.sort(Integer::compareTo);
        sizes.sort(Integer::compareTo);

        int allApplicantsCount = desiredSizes.size();
        int apartmentsCount = sizes.size();

        int result = 0;

        for (int i = 0, j = 0; i < allApplicantsCount; i++) {
            if (j >= apartmentsCount)
                break;
            int desiredSize = desiredSizes.get(i);
            boolean low = (desiredSize - maxDifference) <= sizes.get(j);
            boolean top = (desiredSize + maxDifference) >= sizes.get(j);

            if (low && top) {
                result++;
                j++;
            } else {
                while (!low) {
                    j++;
                    if (j >= apartmentsCount)
                        break;
                    low = (desiredSize - maxDifference) <= sizes.get(j);
                    if ((desiredSize + maxDifference) >= sizes.get(j) && low) {
                        result++;
                        j++;
                        break;
                    }
                }
            }
        }

        return result;
    }
}
