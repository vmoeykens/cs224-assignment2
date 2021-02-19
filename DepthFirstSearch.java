import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Deque;

/**
 * Class to hold a static method for running a depth-first search on a graph represented as an array of linked lists
 */
public class DepthFirstSearch {
    /**
     * Run the depth first search algorithm on a graph representation and print the output to stdout
     * @param graph The graph to run the algorithm on; represented as an array of linked lists where the index in the array
     * is the value of the vertex - 1, and the linked list represents all the connected vertices in the graph
     * @param vertex The vertex to start the algorithm on (this will be a number between 1 and the biggest vertex value inclusive)
     */
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
