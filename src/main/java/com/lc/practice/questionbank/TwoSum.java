package com.lc.practice.questionbank;

import java.util.*;

/*
https://leetcode.com/problems/two-sum/description/
You are given an array of integer and a target sum of 2 integers

Return a boolean true if two sum found
Return a boolean false if two sum not found

Example 1
Input: nums = [1,2,3,4,5] 3
Output: true
Explanation: 3 is in position 2 of the array

Example 2
Input: nums = [1,2,3,4,5] 1
Output: false
Explanation: no two numbers in the array add up to 1
 */
public class TwoSum {
    static boolean suboptimalSolution(int[] input, int sum) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!freq.containsKey(sum - input[i])) {
                freq.put(sum - input[i], 0);
            }
            freq.put(sum - input[i], freq.get(sum - input[i]) + 1);
        }
        for (int i = 0; i < input.length; i++) {
            if (freq.containsKey(input[i])) {
                if (2 * input[i] == sum) {
                    if (freq.get(input[i]) > 1) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
        // 12 min 13 sec
    }

    static boolean optimalSolution(int[] input, int sum) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < input.length; i++) {
            if (!freq.containsKey(sum - input[i])) {
                freq.put(sum - input[i], 0);
            }
            freq.put(sum - input[i], freq.get(sum - input[i]) + 1);
        }
        for (int i = 0; i < input.length; i++) {
            if (freq.containsKey(input[i])) {
                if (2 * input[i] == sum) {
                    if (freq.get(input[i]) > 1) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
        // 0 sec
    }
}
