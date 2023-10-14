package com.aryaEnrico;

import java.util.*;

public class Graph {
    private Map<String, Node> graph = new HashMap<String, Node>();
    private Map<String, Boolean> visited = new HashMap<String, Boolean>();

    public Node createNode(String name) {
        Node node = new Node(name);
        visited.put(name, false);
        graph.put(name, node);
        return node;
    }

    public List<String> BFS(String start) {
        Queue<String> queue = new ArrayDeque<String>();
        List<String> result = new ArrayList<String>();
        if (graph.get(start) == null) {
            return null;
        }
        queue.add(start);
        while (queue.size() > 0) {
            String current = queue.poll();
            if (!visited.get(current)) {
                List<String> adjacent = graph.get(current).getAdjacent();
                for (String data : adjacent) {
                    queue.add(data);
                }
                result.add(current);
            }
            visited.put(current, true);
        }
        return result;
    }

    public void removeNode(String name) {
        this.graph.remove(name);
        this.visited.remove(name);
        removeEdges(name);
    }
    public int getNumOfNodes(){
        return graph.size();
    }

    public void removeEdges(String name) {
        for (Map.Entry<String, Node> entry : graph.entrySet()) {
            Node current = graph.get(entry.getKey());
            List<String> temp = new ArrayList<String>();
            for (String edges : current.getAdjacent()) {
                if (!edges.equals(name)) {
                    temp.add(edges);
                }
            }
            current.addBatchEdges(temp);
        }

    }
}




