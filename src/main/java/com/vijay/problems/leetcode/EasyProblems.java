package com.vijay.problems.leetcode;

import java.util.HashMap;
import java.util.Map;

public class EasyProblems {
    /**
     * int[] nums = [...]; // Input array
     * int[] expectedNums = [...]; // The expected answer with correct length
     * <p>
     * int k = removeDuplicates(nums); // Calls your implementation
     * <p>
     * assert k == expectedNums.length;
     * for (int i = 0; i < k; i++) {
     * assert nums[i] == expectedNums[i];
     * }
     */
    public static int removeDuplicatesFromSortedArray(int[] nums) {
        int start = 0;
        int end = 0;
        int n = nums.length;
        while (end < n) {
            int curr = nums[end];
            while (end < n && nums[end] == curr) {
                end++;
            }
            nums[start++] = curr;
        }
        return start;
    }

    public static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int minIdx = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (isBadVersion(mid)) {
                minIdx = Math.min(minIdx, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return minIdx;
    }
    // This method is just for sample to avoid compile time error
    private static boolean isBadVersion(int num) {
        return num <= 20;
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            // a + b = target;
            // b = target-a;
            if (map.containsKey(target - nums[i])) {
                result[1] = i;
                result[0] = map.get(target - nums[i]);
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
