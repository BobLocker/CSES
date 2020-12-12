package me.boblocker;

import java.util.Iterator;

public class Utils {
    public static <T> void printIterable(Iterable<T> iterable) {
        Iterator<T> iterator = iterable.iterator();

        if (!iterator.hasNext())
            return;

        while (iterator.hasNext()) {
            T next = iterator.next();
            System.out.print(next);

            if (iterator.hasNext())
                System.out.print(" ");
        }
    }
}
