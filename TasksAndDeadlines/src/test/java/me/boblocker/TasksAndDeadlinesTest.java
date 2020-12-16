package me.boblocker;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TasksAndDeadlinesTest {

    @Test
    void testCalculateMaxReward() {
        Map<Integer, List<Integer>> tasks = new HashMap<>();
        tasks.put(6, List.of(10));
        tasks.put(8, List.of(15));
        tasks.put(5, List.of(12));

        assertEquals(2L, TasksAndDeadlines.calculateMaxReward(tasks));
    }
}