import java.util.*;

public class SocialNetworkConnection {
    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("Alice", "Bob");
        addEdge("Alice", "Charlie");
        addEdge("Bob", "David");
        addEdge("Charlie", "Eve");
        addEdge("David", "Eve");

        System.out.println(graph.get("Alice"));

        System.out.println(isConnected("Bob", "Eve"));

        System.out.println(shortestPath("Alice", "Eve"));
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.putIfAbsent(v, new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static boolean isConnected(String u, String v) {
        return graph.get(u).contains(v);
    }

    static int shortestPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        visited.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String node = q.poll();
            for (String nei : graph.get(node)) {
                if (!visited.contains(nei)) {
                    visited.add(nei);
                    dist.put(nei, dist.get(node) + 1);
                    q.add(nei);
                }
            }
        }
        return dist.get(end);
    }
}