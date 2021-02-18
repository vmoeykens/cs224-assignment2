import java.util.Scanner;

public class Main { 
  
    public static void main(String[] args) 
    { 
        Scanner in = new Scanner(System.in);

        Graph graph1 = new Graph();
        Graph graph2 = new Graph();
        
        int maxVertexValue = graph1.graph.size();
        int startVertex = -1;
        while (startVertex < 1 || startVertex > maxVertexValue) {
            System.out.println("Enter a number between 1 and " + maxVertexValue);
            String startVertexString = in.nextLine();
            startVertex = Integer.parseInt(startVertexString);
        }
        
        DepthFirstSearch.begin(graph1.graph, startVertex);
        BreadthFirstSearch.begin(graph2.graph, startVertex);
    } 
} 