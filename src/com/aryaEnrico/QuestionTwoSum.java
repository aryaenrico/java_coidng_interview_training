package com.aryaEnrico;

import java.util.HashMap;
import java.util.Map;

public class QuestionTwoSum {
    public int[] findTarget(int[] nums, int target) {
        int numberToFind;
        Map<Integer, Integer> dictionary = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            numberToFind = target - nums[i];
            if (dictionary.get(numberToFind) != null) {
                result[0] = i;
                result[1] = dictionary.get(numberToFind);
                return result;
            }else{
                dictionary.put(nums[i],i);
            }
        }
        return null;
    }
}
