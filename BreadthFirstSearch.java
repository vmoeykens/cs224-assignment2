import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void begin(ArrayList<LinkedList<Integer>> graph, int vertex) {
        System.out.println("Starting Breadth First Search on vertex " + vertex);
        // Create an array for keeping track of vertexes that have been discovered. 
        boolean discovered[] = new boolean[graph.size()];
        // Set the start node as discovered 
        discovered[vertex - 1] = true;
        // Create a fifo queue to keep track of vertexes
        Queue<Integer> q = new LinkedList<Integer>();
        // Add our starting vertex to the queue
        q.add(vertex);
        // Create a layer counter 
        int i = 0;
        while (q.peek() != null) {
            int node = q.poll();
            System.out.println("Moving to node: " + node + " in the queue.");
            while (graph.get(node - 1).peek() != null) {
                int currentNode = graph.get(node - 1).poll();
                System.out.println("On edge: " + currentNode);
                if (!discovered[currentNode - 1]) {
                    discovered[currentNode - 1] = true;
                    q.add(currentNode);
                }
            }
        }
    }
}
