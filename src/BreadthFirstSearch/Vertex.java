package BreadthFirstSearch;

import java.util.List;
import java.util.ArrayList;

public class Vertex {
  private int number;
  private boolean visited;
  private List<Vertex> neighbourList;

  public Vertex (int number) {
    this.number = number;
    this.neighbourList = new ArrayList<>();
  }

  public int getNumber () {
    return number;
  }

  public void setNumber (int number) {
    this.number = number;
  }

  public boolean getVisited () {
    return visited;
  }

  public void setVisited (boolean visited) {
    this.visited = visited;
  }

  public List<Vertex> getNeighbourList () {
    return neighbourList;
  }

  public void setNeighbourList (List<Vertex> neighbourList) {
    this.neighbourList = neighbourList;
  }

  public void addNeighbourVertex (Vertex vertex) {
    this.neighbourList.add(vertex);
  }

  @Override
  public String toString () {
    return String.format("Number is %d", number);
  }
}