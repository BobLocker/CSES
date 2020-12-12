package me.boblocker;

import java.io.IOException;

public class CoinPiles {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader(System.in);
        int countOfTests = reader.nextInt();

        for (int i = 0; i < countOfTests; i++) {
            int a = reader.nextInt();
            int b = reader.nextInt();

            if (canEmpty(a, b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    public static boolean canEmpty(int a, int b) {
        if (a ==0 && b == 0) {
            return true;
        } else if ((a+b) % 3 != 0) {
            return false;
        } else if (a == 0 || b ==0) {
            return false;
        } else if (2*a < b || 2*b < a) {
            return false;
        } else {
            return true;
        }
    }
}
