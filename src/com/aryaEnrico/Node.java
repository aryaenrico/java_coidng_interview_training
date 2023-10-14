package com.aryaEnrico;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String node;
    private List<String> edges = new ArrayList<String>();

    public Node(String name) {
        this.node = name;
    }

    public void addedges(String edges) {
        this.edges.add(edges);
        System.out.println("succces added new edges");
    }

    public void addBatchEdges(List<String> data){
        edges.clear();
        edges.addAll(data);
    }

    public List<String> getAdjacent() {
        return this.edges;
    }

}
