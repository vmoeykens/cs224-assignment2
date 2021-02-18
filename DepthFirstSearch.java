import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;

public class DepthFirstSearch {
    public static void begin(ArrayList<LinkedList<Integer>> graph, int vertex) {
        System.out.println("Starting Depth First Search on vertex " + vertex);
        // Create an array for keeping track of vertexes that have been explored. 
        boolean explored[] = new boolean[graph.size()];
        // Create a new lifo queue
        Deque<Integer> q = new LinkedList<Integer>();
        // Add our starting vertex to the queue
        q.push(vertex);
        // While items are still in the queue
        while (q.peek() != null) {
            int node = q.pop();
            System.out.println("Moving to node: " + node + " in the queue.");
            // Set the node index (the value - 1) to explored
            explored[node - 1] = true;
            // Iterate through edges going from this node
            while (graph.get(node - 1).peek() != null) {
                int currentNode = graph.get(node - 1).poll();
                System.out.println("On edge: " + currentNode);
                if (explored[currentNode - 1] == false) {
                    q.push(currentNode);
                }
            }
        }
    }
}
