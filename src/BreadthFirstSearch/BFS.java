package BreadthFirstSearch;

import java.util.Queue;
import java.util.LinkedList;

public class BFS {
  public BFS (Vertex rootVertex) {
    Queue<Vertex> queue = new LinkedList<Vertex>();
    rootVertex.setVisited(true);
    queue.add(rootVertex);

    while (!queue.isEmpty()) {
      Vertex vertex = queue.remove();
      System.out.println(vertex);

      for (Vertex v : vertex.getNeighbourList()) {
        if (!v.getVisited()) {
          v.setVisited(true);
          queue.add(v);
        }
      }
    }
  }
}