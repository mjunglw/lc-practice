package com.lc.practice.questionbank;

/*
https://leetcode.com/problems/fibonacci-number/description/
You are given a integer >= 0

Return the Fibonacci number of the input

Example 1
Input: nums = 3
Output: 2
Explanation: F(3) = F(2) + F(1) = F(1) + F(0) + F(1)

Example 2
Input: nums = 4
Output: 3
Explanation: F(4) = F(3) + F(2) = F(2) + F(1) + F(2) = F(1) + F(0) + F(1) + F(2) = F(1) + F(0) + F(1) + F(1) + F(0)

Base cases
F(1) = 1
F(0) = 0
F(n) = F(n - 1) + F(n - 2)
 */

public class Fibonacci {
    static int suboptimalSolution(int input) {
        if (input == 0) return 0;
        if (input == 1) return 1;

        return suboptimalSolution(input - 1) + suboptimalSolution(input - 2);
        // 2 min 30 sec
    }

    static int optimalSolution(int input) {
        int[] dp = new int[input + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= input; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[input];
        // 1 min 36 sec
    }
}
