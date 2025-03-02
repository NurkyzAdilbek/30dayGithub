package day20;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
//1 Простое представление графа
//Создать класс Graph, который хранит вершины и рёбра.
//Добавить метод для вывода всех вершин и их соседей.
public class Graph {
    private Map<Integer, List<Integer>> adjList;

    public Graph() {
        adjList = new HashMap<>();
    }

    public void addVertex(int v) {
        adjList.putIfAbsent(v, new ArrayList<>());
    }

    public void addEdge(int v, int w) {
        adjList.putIfAbsent(v, new ArrayList<>());
        adjList.putIfAbsent(w, new ArrayList<>());
        adjList.get(v).add(w);
        adjList.get(w).add(v); // Für einen ungerichteten Graphen
    }

    public void printGraph() {
        for (var entry : adjList.entrySet()) {
            System.out.println("Knoten " + entry.getKey() + " ist verbunden mit " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.printGraph();
    }


}
