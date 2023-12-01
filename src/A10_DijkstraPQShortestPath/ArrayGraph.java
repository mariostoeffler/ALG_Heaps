package A10_DijkstraPQShortestPath;

import java.util.List;

public class ArrayGraph implements Graph {

    private int edges[][];
    private int numVertices;
    private boolean directed;

    public ArrayGraph(int[][] edges, int numVertices, boolean directed) {
        edges = new int[numVertices][numVertices];
        this.numVertices = numVertices;
        this.directed = directed;
    }

    @Override
    public int numVertices() {
        return 0;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public boolean hasEdge(int u, int v) {
        return false;
    }

    @Override
    public int getEdgeWeight(int u, int v) {
        return 0;
    }

    @Override
    public void addEdge(int u, int v) {

    }

    @Override
    public void addEdge(int u, int v, int weight) {

    }

    @Override
    public void removeEdge(int u, int v) {

    }

    @Override
    public List<WeightedEdge> getEdges(int v) {
        return null;
    }
}
