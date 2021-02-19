import java.util.Scanner;

public class Main { 
  
    
    public static void main(String[] args) 
    { 
        // Generate two graph objects from our hard-coded class so that we can reference the array
        // of linked lists representing the assignment graph
        Graph graph1 = new Graph();
        Graph graph2 = new Graph();
        
        // Figure out what the max vertex index is so we can cleanse our input (we make the assumption here that both
        // graph objects are the same)
        int maxVertexValue = graph1.graph.size();
        // Prompt user input for a starting vertex... don't let them put a number out of range
        // This method is not fault resistant against non integer input... please don't put any
        int startVertex = promptInput(maxVertexValue);
        
        // Run our DFS and BFS algorithms
        DepthFirstSearch.begin(graph1.graph, startVertex);
        BreadthFirstSearch.begin(graph2.graph, startVertex);
    }

    /***
     * Prompt a user for integer input for the starting vertex on the graph traversal
     * This is currently not fault resistant against non-integer input
     * 
     * @param maxValue The maximum value for a vertex on the graph
     * @return The cleansed user's input
     */
    private static int promptInput(int maxValue) {
        Scanner in = new Scanner(System.in);
        int startVertex = -1;
        while (startVertex < 1 || startVertex > maxValue) {
            System.out.println("Enter a number between 1 and " + maxValue);
            String startVertexString = in.nextLine();
            startVertex = Integer.parseInt(startVertexString);
        }
        in.close();
        return startVertex;
    }
} 