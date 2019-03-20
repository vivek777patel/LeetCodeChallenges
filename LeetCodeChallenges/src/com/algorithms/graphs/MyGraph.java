package com.algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class MyGraph {

	static class Graph {
		int V;
		LinkedList<Integer> adjListArray[];

		// constructor
		Graph(int V) {
			this.V = V;

			// define the size of array as
			// number of vertices
			adjListArray = new LinkedList[V];

			// Create a new list for each vertex
			// such that adjacent nodes can be stored
			for (int i = 0; i < V; i++) {
				adjListArray[i] = new LinkedList<>();
			}
		}
		
		void addEdge(int v, int w) {
			adjListArray[v].add(w);
		}
		
		void DFSUtil(int v, boolean visited[]) {
			// Mark the current node as visited and print it
			visited[v] = true;
			System.out.print(v + " ");

			// Recur for all the vertices adjacent to this vertex
			Iterator<Integer> i = adjListArray[v].listIterator();
			while (i.hasNext()) {
				int n = i.next();
				if (!visited[n])
					DFSUtil(n, visited);
			}
		}

		// The function to do DFS traversal. It uses recursive DFSUtil()
		void DFS(int v) {
			// Mark all the vertices as not visited(set as
			// false by default in java)
			boolean visited[] = new boolean[V];

			// Call the recursive helper function to print DFS traversal
			DFSUtil(v, visited);
		}
		
		void BFS(int s) {
			// Mark all the vertices as not visited(By default
			// set as false)
			boolean visited[] = new boolean[V];

			// Create a queue for BFS
			LinkedList<Integer> queue = new LinkedList<Integer>();

			// Mark the current node as visited and enqueue it
			visited[s] = true;
			queue.add(s);

			while (queue.size() != 0) {
				// Dequeue a vertex from queue and print it
				s = queue.poll();
				System.out.print(s + " ");

				// Get all adjacent vertices of the dequeued vertex s
				// If a adjacent has not been visited, then mark it
				// visited and enqueue it
				for(Integer i : adjListArray[s]) {
					if (!visited[i]) {
						visited[i] = true;
						queue.add(i);
					}
				}
			}
		}
	}

	

	static void addEdge(Graph graph, int src, int dest) {
		// Add an edge from src to dest.
		graph.adjListArray[src].add(dest);

		// Since graph is undirected, add an edge from dest
		// to src also
		graph.adjListArray[dest].add(src);
	}

	// A utility function to print the adjacency list
	// representation of graph
	static void printGraph(Graph graph) {
		for (int v = 0; v < graph.V; v++) {
			System.out.println("Adjacency list of vertex " + v);
			System.out.print("head");
			for (Integer pCrawl : graph.adjListArray[v]) {
				System.out.print(" -> " + pCrawl);
			}
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {
		// Undirected Graph
		/*int V = 5;
		Graph graph = new Graph(V);
		addEdge(graph, 0, 1);
		addEdge(graph, 0, 4);
		addEdge(graph, 1, 2);
		addEdge(graph, 1, 3);
		addEdge(graph, 1, 4);
		addEdge(graph, 2, 3);
		addEdge(graph, 3, 4);

		// print the adjacency list representation of
		// the above graph
		printGraph(graph);*/
		
		// Directed Graph
		Graph g = new Graph(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.BFS(2);
        System.out.println("\nDFS :");
        g.DFS(2);
	}

}
