import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public final class Graph {
    // Hardcoding this for now... this could be much better (for example reading from a CSV file and building it)
    public ArrayList<LinkedList<Integer>> graph = new ArrayList<LinkedList<Integer>>(Arrays.asList(new LinkedList<Integer>(Arrays.asList(2, 3)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(1, 3, 4, 5)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(1, 2, 5, 7, 8)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(2, 5)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(2, 3, 4, 6)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(5)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(3, 8)),
                                                                                                          new LinkedList<Integer>(Arrays.asList(3, 7))));
}
