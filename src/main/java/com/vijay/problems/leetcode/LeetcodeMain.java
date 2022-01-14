package com.vijay.problems.leetcode;

import static com.vijay.problems.leetcode.EasyProblems.binarySearch;
import static com.vijay.problems.leetcode.EasyProblems.removeDuplicatesFromSortedArray;

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

    }
}
