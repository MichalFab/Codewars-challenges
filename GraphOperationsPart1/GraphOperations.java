package Challenges.GraphOperationsPart1;


import java.util.*;
import java.util.stream.Collectors;

public class GraphOperations {

    public static Set<Vertex> getNeighbours(Graph graph, Vertex vertex){
        return graph
                .getEdges()
                .stream()
                .filter(x -> x.getV1().equals(vertex) || x.getV2().equals(vertex))
                .map(x -> (x.getV1().equals(vertex)) ? x.getV2() : x.getV1())
                .collect(Collectors.toSet());
    }


    /*
    Added main method to check the algorithm.

     */
    public static void main(String[] args) {
        Graph graph = new Graph();
        Vertex v1 = new Vertex();
        List<Vertex> vertexList = Arrays.asList(v1, new Vertex(), new Vertex(), new Vertex());
        graph.addVertices();
        graph.addEdge(new Edge(vertexList.get(0), vertexList.get(1)));
        graph.addEdge(new Edge(vertexList.get(1), vertexList.get(3)));
        graph.addEdge(new Edge(vertexList.get(2), vertexList.get(3)));
        graph.addEdge(new Edge(vertexList.get(0), vertexList.get(2)));
    }

}
