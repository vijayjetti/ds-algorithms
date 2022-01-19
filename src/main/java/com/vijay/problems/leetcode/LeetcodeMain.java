package com.vijay.problems.leetcode;

import static com.vijay.problems.leetcode.EasyProblems.*;

public class LeetcodeMain {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3};
        System.out.println(removeDuplicatesFromSortedArray(nums));

        // Binary Search
        int[] binaryNums = {-1,0,3,5,9,12};
        System.out.print("Binary Search: ");
        System.out.println(binarySearch(binaryNums, 9));
        System.out.print("Binary Search: ");
        System.out.println(binarySearch(binaryNums, 1));
        System.out.println("Two Sum: ");
        int[] twoSumNums = {-1,0,3,5,9,12};
        int[] twoSum = twoSum(twoSumNums, 15);
        System.out.println("(" + twoSum[0] + ", " + twoSum[1] + ")");
        twoSum = twoSum(twoSumNums, 12);
        System.out.println("(" + twoSum[0] + ", " + twoSum[1] + ")");
        twoSum = twoSum(twoSumNums, 8);
        System.out.println("(" + twoSum[0] + ", " + twoSum[1] + ")");
    }
}
