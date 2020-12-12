package me.boblocker;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class PalindromeReorder {
    public static final String NO_SOLUTION = "NO SOLUTION";

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Character> characters = new LinkedList<>();

        int c;
        while ( !((c = br.read()) == '\n' || c == '\r' || c  == -1)) {
            characters.add((char) c);
        }

        String result = reorderToPalindrome(characters);
        System.out.println(result);
    }

    public static String reorderToPalindrome(List<Character> characters) {
        characters.sort(Character::compareTo);

        StringBuilder sb = new StringBuilder();

        if (characters.size() % 2 == 0) {
            for (int i = 'A'; i <= 'Z'; i++) {
                int firstIndex = characters.indexOf((char) i);
                if (firstIndex == -1) {
                    continue;
                }

                int lastIndex = characters.lastIndexOf((char) i);
                int count = lastIndex - firstIndex + 1;
                if (count % 2 != 0) {
                    return NO_SOLUTION;
                }

                for (int j = 0; j < count / 2; j++) {
                    sb.append((char) i);
                }
            }
            StringBuilder sbTail = new StringBuilder(sb);
            sbTail.reverse();
            sb.append(sbTail);
        } else {
            StringBuilder middle = new StringBuilder();
            for (int i = 'A'; i <= 'Z'; i++) {
                int firstIndex = characters.indexOf((char) i);
                if (firstIndex == -1) {
                    continue;
                }

                int lastIndex = characters.lastIndexOf((char) i);
                int count = lastIndex - firstIndex + 1;
                if (count % 2 != 0) {
                    if (middle.length() == 0)
                        middle.append(String.valueOf((char) i).repeat(count));
                    else {
                        return NO_SOLUTION;
                    }
                } else {
                    for (int j = 0; j < count / 2; j++) {
                        sb.append((char) i);
                    }
                }
            }
            StringBuilder sbTail = new StringBuilder(sb);
            sbTail.reverse();
            sb.append(middle);
            sb.append(sbTail);
        }

        return sb.toString();
    }
}
