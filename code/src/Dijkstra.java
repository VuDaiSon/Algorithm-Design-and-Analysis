import java.util.*;

public class Dijkstra {
    public static int[] dijkstra(List<List<Edge>> graph, int source) {
        int n = graph.size();
        int[] distances = new int[n];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[source] = 0;

        PriorityQueue<Node> minHeap = new PriorityQueue<>(Comparator.comparingInt(Node::getDistance));
        minHeap.offer(new Node(source, 0));

        boolean[] visited = new boolean[n];

        while (!minHeap.isEmpty()) {
            Node currentNode = minHeap.poll();
            int currentVertex = currentNode.getVertex();

            if (visited[currentVertex]) continue;
            visited[currentVertex] = true;

            for (Edge neighbor : graph.get(currentVertex)) {
                int newDistance = distances[currentVertex] + neighbor.getWeight();
                if (newDistance < distances[neighbor.getTo()]) {
                    distances[neighbor.getTo()] = newDistance;
                    minHeap.offer(new Node(neighbor.getTo(), newDistance));
                }
            }
        }

        return distances;
    }

    public static void main(String[] args) {
        // Code minh họa việc sử dụng hàm dijkstra
    }
}

class Node {
    private int vertex;
    private int distance;

    public Node(int vertex, int distance) {
        this.vertex = vertex;
        this.distance = distance;
    }

    public int getVertex() {
        return vertex;
    }

    public int getDistance() {
        return distance;
    }
}

class Edge {
    private int to;
    private int weight;

    public Edge(int to, int weight) {
        this.to = to;
        this.weight = weight;
    }

    public int getTo() {
        return to;
    }

    public int getWeight() {
        return weight;
    }
}
