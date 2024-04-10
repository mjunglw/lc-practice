package com.lc.practice.questionbank;

import java.util.Arrays;

/*
https://www.geeksforgeeks.org/binary-search/
You are given a sorted array of integer and a number to find

Return a boolean true if number is found in array
Return a boolean false if number is not found in array

Example 1
Input: nums = [1,2,3,4,5] 3
Output: true
Explanation: 3 is in position 2 of the array

Example 2
Input: nums = [1,2,3,4,5] 6
Output: false
Explanation: 6 is not in the input array
 */
public class FindInSortedArray {
    static boolean suboptimalSolution(int[] input, int find) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == find) {
                return true;
            }
        }
        return false;
        // 41 sec
    }

    static boolean optimalSolution(int[] input, int find) {

        return binarySearch(input, find, 0, input.length - 1);
        // return Arrays.binarySearch(input, find) >= 0;
        // 15 sec if I can use this :)
    }

    private static boolean binarySearch(int[] input, int find, int left, int right) {
        if (left > right) {
            return false;
        }

        if (left == right) {
            return input[left] == find;
        }

        int mid = (left + right) / 2;
        if (input[mid] == find) {
            return true;
        }

        if (input[mid] < find) {
            return binarySearch(input, find, mid + 1, right);
        }

        if (input[mid] > find) {
            return binarySearch(input, find, left, mid - 1);
        }

        return false;
        // 2 min 42 sec
    }
}
