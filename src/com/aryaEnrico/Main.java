package com.aryaEnrico;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//	QuestionTwoSum questionTwoSum   = new QuestionTwoSum ();
//    int[] result = questionTwoSum.findTarget(new int[]{1,3,7,9,2},5);
//    System.out.println(Arrays.toString(result));


        List<Integer>data = ArrayGraph.BFS(1);
        for(int i=0;i<data.size();i++){
            System.out.println(data.get(i));
        }

    }
}
