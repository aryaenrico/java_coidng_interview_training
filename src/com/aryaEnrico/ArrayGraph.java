package com.aryaEnrico;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class ArrayGraph {
    static int[][] graph = {
            {0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0},
            {1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1},
            {0, 0, 1, 1, 0}
    };
    static boolean[] marker = {false, false, false, false, false};
    static List<Integer> resultDfs = new ArrayList<Integer>();
    static void DFS(int start) {

        resultDfs.add(start);
        marker[start] = true;
        List<Integer> adj = adjacentDfs(graph[start]);

        for (int next : adj) {
            if (!marker[next]) {
                DFS(next);
            }
        }
    }

    static List<Integer> BFS(int start) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        List<Integer> visited = new ArrayList<Integer>();
        queue.add(start);
        while (queue.size() > 0) {
            int current = queue.poll();
            if (!marker[current]) {
                List<Integer> adjacentSearch = adjacent(graph[current]);
                visited.add(current);
                for (int i = 0; i < adjacentSearch.size(); i++) {
                    queue.add(adjacentSearch.get(i));
                }
            }
            marker[current] = true;
        }
        return visited;

    }

    static List<Integer> adjacent(int[] data) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                result.add(i);
            }
        }
        return result;
    }

    static List<Integer> adjacentDfs(int[] data) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < data.length; i++) {
            if (data[i] != 0) {
                result.add(i);
            }
        }
        return result;
    }


}
