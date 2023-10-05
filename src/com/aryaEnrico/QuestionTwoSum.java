package com.aryaEnrico;

public class QuestionTwoSum {
    public int[] findTarget(int[] nums, int target) {
        int pointer1, pointer2, numberToFind;
        if (nums.length <= 1) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            pointer1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                pointer2 = nums[j];
                numberToFind = target - pointer1;
                if (pointer2 == numberToFind) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return null;
    }
}
