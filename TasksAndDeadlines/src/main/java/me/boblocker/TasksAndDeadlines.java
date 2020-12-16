package me.boblocker;

import java.util.*;
import java.util.stream.Collectors;

public class TasksAndDeadlines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tasksCount = scanner.nextInt();
        Map<Integer, List<Integer>> tasks = new HashMap<>();

        for (int i = 0; i < tasksCount; i++) {
            int duration = scanner.nextInt();
            int deadline = scanner.nextInt();
            List<Integer> deadlines = tasks.getOrDefault(duration, new ArrayList<>());
            deadlines.add(deadline);
            tasks.put(duration, deadlines);
        }

        long maxReward = calculateMaxReward(tasks);

        System.out.println(maxReward);
    }

    public static long calculateMaxReward(Map<Integer, List<Integer>> tasks) {
        long time = 0;
        long reward = 0;

        List<Integer> durations = tasks.keySet().stream()
                .sorted()
                .collect(Collectors.toList());

        for (int duration : durations) {
            List<Integer> deadlines = tasks.get(duration);
            for (int deadline : deadlines ) {
                time += (long) duration;
                reward += (long) deadline - time;
            }
        }
        return reward;
    }
}
