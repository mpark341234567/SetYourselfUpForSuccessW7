package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class DupeRemoverTest {
    @Test
    void testRemoveDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1,2,3,3,2,1));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3));
        ArrayList<Integer> result = DupeRemover.removeDuplicates(input);
        result.sort(Comparator.naturalOrder());
        assertEquals(expected.size(), result.size(), "removeDuplicates should return a list devoid of duplicates");
    }
    @Test
    void testRemoveDuplicates2() {
        ArrayList<Character> input = new ArrayList<>(Arrays.asList('A', 'B', 'C', 'C', 'A'));
        ArrayList<Character> expected = new ArrayList<>(Arrays.asList('A', 'B', 'C'));
        ArrayList<Character> result = DupeRemover.removeDuplicates(input);
        result.sort(Comparator.naturalOrder());
        assertEquals(expected.size(), result.size(), "removeDuplicates should return a list devoid of duplicates");
    }
    @Test
    void testRemoveDuplicates3() {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("Hello", "World", "Hello", "Java"));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList("Hello", "Java", "World"));
        ArrayList<String> result = DupeRemover.removeDuplicates(input);
        result.sort(Comparator.naturalOrder());
        assertEquals(expected.size(), result.size(), "removeDuplicates should return a list devoid of duplicates");
    }
    @Test
    void testRemoveDuplicatesEmpty() {
        ArrayList<Integer> input = new ArrayList<>();
        ArrayList<Integer> expected = new ArrayList<>();
        ArrayList<Integer> result = DupeRemover.removeDuplicates(input);
        assertEquals(expected.size(), result.size(), "removeDuplicates should return an empty list when input is empty");
    }
    @Test
    void testRemoveDuplicatesNoDuplicates() {
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> result = DupeRemover.removeDuplicates(input);
        result.sort(Comparator.naturalOrder());
        assertEquals(expected.size(), result.size(), "removeDuplicates should return the same list when there are no duplicates");
    }
}
