package com.lc.practice.questionbank;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInArrayTest {
    @Test
    public void duplicateFoundSuboptimalSolution() {
        int[] input = new int[]{1,2,3,4,5,5,4,3,2,1};
        Set<Integer> output = new HashSet<>();
        output.add(1);
        output.add(2);
        output.add(3);
        output.add(4);
        output.add(5);
        assertEquals(DuplicatesInArray.suboptimalSolution(input), output);
    }

    @Test
    public void duplicateNotFoundSuboptimalSolution() {
        int[] input = new int[]{1,2,3,4,5};
        Set<Integer> output = new HashSet<>();
        assertEquals(DuplicatesInArray.suboptimalSolution(input), output);
    }

    @Test
    public void duplicateFoundOptimalSolution() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 150000; i++) {
            input.add(i);
            if (new Random().nextInt(5) == 3) input.add(i - 5);
        }
        int[] inputArray = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            inputArray[i] = input.get(i);
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            System.out.println("input array built " + Arrays.toString(inputArray));
            Set<Integer> solution = com.lc.practice.questionbanksolutions.DuplicatesInArray.optimalSolution(inputArray);
            System.out.println("solution " + solution);
            Set<Integer> output = DuplicatesInArray.optimalSolution(inputArray);
            assertEquals(solution, output);
        });
    }

    @Test
    public void duplicateNotFoundOptimalSolution() {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < 150000; i++) {
            if (new Random().nextInt(5) == 3) continue;
            input.add(i);
        }
        int[] inputArray = new int[input.size()];
        for (int i = 0; i < input.size(); i++) {
            inputArray[i] = input.get(i);
        }
        assertTimeoutPreemptively(Duration.ofSeconds(5), () -> {
            System.out.println("input array built " + Arrays.toString(inputArray));
            Set<Integer> solution = com.lc.practice.questionbanksolutions.DuplicatesInArray.optimalSolution(inputArray);
            System.out.println("solution " + solution);
            Set<Integer> output = DuplicatesInArray.optimalSolution(inputArray);
            assertEquals(solution, output);
        });
    }

}