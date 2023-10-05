package com.aryaEnrico;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
	QuestionTwoSum questionTwoSum   = new QuestionTwoSum ();
    int[] result = questionTwoSum.findTarget(new int[]{1,3,7,9,2},11);
    System.out.println(Arrays.toString(result));

    }
}
