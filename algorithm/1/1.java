package com.zyyoona7.ex001;

import java.util.Arrays;

/**
 * problem url https://leetcode.com/problems/two-sum/
 * <p>
 * create by zyyoona7
 */

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                    break;
                }
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] result = twoSum(nums, 3);
        if (result[0] == 0 && result[1] == 0) {
            System.out.printf("没有符合的indices");
        } else {
            System.out.printf("indices=" + Arrays.toString(result));
        }
    }

}
