package me.boblocker;

import java.io.IOException;

public class NumberSpiral {
    public static void main(String[] args) throws IOException {
        Reader reader = new Reader(System.in);
        int count = reader.nextInt();

        for (int i = 0; i < count; i++) {
            long y = reader.nextLong();
            long x = reader.nextLong();

            System.out.println(getNumber(y,x));
        }
    }

    public static long getNumber(long y, long x) {
        if (y > x) {
            if (y%2 == 0)
                return y * y - x + 1;
            else
                return (y-1) * (y-1) + x;
        } else {
            if (x%2 == 0)
                return (x-1)*(x-1) + y;
            else
                return x * x - y + 1;
        }
    }
}
