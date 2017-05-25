package hackerRank.algorithms.warmUp.graph_theory;

import javafx.util.Pair;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;

/**
 * Created by hnastevska on 4/23/2017.
 */
public class JourneyToTheMoon {
    public static class AdjacencyList {
        private final LinkedList< Pair<Integer, Integer> >[] adjacencyList;

        // Constructor
        public AdjacencyList(int vertices) {
            adjacencyList = (LinkedList< Pair<Integer, Integer> >[]) new LinkedList[vertices];

            for (int i = 0; i < adjacencyList.length; ++i) {
                adjacencyList[i] = new LinkedList<>();
            }
        }

        // Appends a new Edge to the linked list
        public void addEdge(int startVertex, int endVertex, int weight) {
            adjacencyList[startVertex].add(new Pair<>(endVertex + 1, weight));
        }

        // Returns number of vertices
        // Does not change for an object
        public int getNumberOfVertices() {
            return adjacencyList.length;
        }

        // Returns number of outward edges from a vertex
        public int getNumberOfEdgesFromVertex(int startVertex) {
            return adjacencyList[startVertex].size();
        }

        // Returns a copy of the Linked List of outward edges from a vertex
        public LinkedList< Pair<Integer, Integer> > getEdgesFromVertex(int startVertex) {
            LinkedList< Pair<Integer, Integer> > edgeList
                    = (LinkedList< Pair<Integer, Integer> >) new LinkedList(adjacencyList[startVertex]);

            return edgeList;
        }

        // Prints the Adjaency List
        public void printAdjacencyList() {
            int i = 0;

            for (LinkedList< Pair<Integer, Integer> > list : adjacencyList) {
                System.out.print("adjacencyList[" + (i + 1) + "] -> ");

                for (Pair<Integer, Integer> edge : list) {
                    System.out.print(edge.getKey() + "(" + edge.getValue() + ") ");
                }

                ++i;
                System.out.println();
            }
        }

        // Removes an edge and returns true if there
        // was any change in the collection, else false
        public boolean removeEdge(int startVertex, Pair<Integer, Integer> edge) {
            return adjacencyList[startVertex - 1].remove(edge);
        }

        public boolean hasEdge(int startVertex, int endVertex, int weight) {
            return adjacencyList[startVertex].contains(new Pair<>(endVertex, weight));
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = bfr.readLine().split(" ");
        int N = Integer.parseInt(temp[0]);
        int I = Integer.parseInt(temp[1]);
        AdjacencyList graph = new AdjacencyList(N);

        for(int i = 0; i < I; i++){
            temp = bfr.readLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            int b = Integer.parseInt(temp[1]);
            graph.addEdge(a,b,1);

            // Store a and b in an appropriate data structure of your choice
        }
        graph.printAdjacencyList();


        long combinations = 0;

        // Compute the final answer - the number of combinations

        System.out.println(combinations);

    }
}

