package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeReorderTest {

    @Test
    void testReorderToPalindrome() {
        List<Character> characters = "AAAACACBA".chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.toList());

        assertEquals("AAACBCAAA", PalindromeReorder.reorderToPalindrome(characters));
    }

    @Test
    void testReorderToPalindrome_ReturnNoSolution() {
        List<Character> characters = "AABBCD".chars()
                .mapToObj(x -> (char) x)
                .collect(Collectors.toList());

        assertEquals(PalindromeReorder.NO_SOLUTION, PalindromeReorder.reorderToPalindrome(characters));
    }
}