package com.aryaEnrico;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {
//	QuestionTwoSum questionTwoSum   = new QuestionTwoSum ();
//    int[] result = questionTwoSum.findTarget(new int[]{1,3,7,9,2},5);
//    System.out.println(Arrays.toString(result));


        ArrayGraph.DFS(0);
        System.out.println(ArrayGraph.resultDfs.size());
        for(int data:ArrayGraph.resultDfs){
            System.out.println(data);
        }

//        Graph graphApp = new Graph();
//        Node nodeA =  graphApp.createNode("A");
//        Node nodeB =  graphApp.createNode("B");
//        Node nodeC =  graphApp.createNode("C");
//        nodeA.addedges("B");
//        nodeA.addedges("C");
//        nodeB.addedges("A");
//        nodeC.addedges("A");
//
//        List<String> data = graphApp.BFS("C");
//
//
//        for(String result:data){
//            System.out.println(result);
//        }
//        System.out.println(data.size());
//        graphApp.removeNode("C");
//        System.out.println(graphApp.getNumOfNodes());





    }
}
