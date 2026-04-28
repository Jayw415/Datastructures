class Main {
  public static void main(String[] args) {
    // 1. Define the vertices (buildings) based on the campus map
    String[] buildings =  {"1. Liberal Arts",
    "2. Student Services",
    "3. Health Careers & Sciences",
    "4. Health Technologies Center",
    "5. Recreation Center",
    "6. Technology Learning Center",
    "7. Business & Technology", 
    "8. Theatre"};
    // 2-Define Edges
   int[][] edges = {{0, 1}, {0, 7}, {1, 6}, {1, 5}, {1, 2}, {5, 2}, {1, 4}, {5, 4}, {2, 3}, {5, 2}};

    // 3. Create the graph (name "graph") using the vertices and edges
    Graph<String> graph = new UnweightedGraph<>(buildings,
edges);
    // 4. Perform a depth-first search (name "dfs")(DFS) starting from the "Business & Technology" building
  graph.dfs(6);
    // 5. Retrieve and print the search order of the DFS traversal
     System.out.println(graph.dfs(6).getSearchOrder());
    // 6. Print the parent-child relationships for each vertex during the DFS traversal
   System.out.println(graph.dfs(6).getParent(6));
    // 7. Call the printPath method (assuming this method exists in the UnweightedGraph class)
  graph.dfs(6).printPath(3);
  graph.dfs(6).printPath(1);
  graph.dfs(6).printPath(4);
    // 8. Call printTree() to print the entire DFS tree (assuming this method exists in the UnweightedGraph class)
      graph.dfs(6).printTree();
  }
}