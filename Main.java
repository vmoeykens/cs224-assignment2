public class Main { 
  
    public static void main(String[] args) 
    { 
        Graph graph1 = new Graph();
        Graph graph2 = new Graph();

        DepthFirstSearch.begin(graph1.graph, 1);
        BreadthFirstSearch.begin(graph2.graph, 1);
    } 
} 