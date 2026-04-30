import java.util.*;

class Pair {
    String node;
    int dist;
    Pair(String n, int d) {
        node = n;
        dist = d;
    }
}

public class CityRoadNetwork {
    static Map<String, List<Pair>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("A", "B", 5, true);
        addEdge("B", "C", 3, false);
        addEdge("A", "D", 7, false);
        addEdge("D", "E", 2, true);
        addEdge("C", "E", 4, true);

        bfsReachable("A");

        System.out.println(bfsPath("A", "E"));
    }

    static void addEdge(String u, String v, int w, boolean oneWay) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(new Pair(v, w));
        if (!oneWay) {
            graph.putIfAbsent(v, new ArrayList<>());
            graph.get(v).add(new Pair(u, w));
        }
    }

    static void bfsReachable(String start) {
        Queue<String> q = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        q.add(start);
        visited.add(start);

        while (!q.isEmpty()) {
            String node = q.poll();
            System.out.print(node + " ");
            for (Pair p : graph.getOrDefault(node, new ArrayList<>())) {
                if (!visited.contains(p.node)) {
                    visited.add(p.node);
                    q.add(p.node);
                }
            }
        }
    }

    static int bfsPath(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String, Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start, 0);

        while (!q.isEmpty()) {
            String node = q.poll();
            for (Pair p : graph.getOrDefault(node, new ArrayList<>())) {
                if (!dist.containsKey(p.node)) {
                    dist.put(p.node, dist.get(node) + 1);
                    q.add(p.node);
                }
            }
        }
        return dist.getOrDefault(end, -1);
    }
}