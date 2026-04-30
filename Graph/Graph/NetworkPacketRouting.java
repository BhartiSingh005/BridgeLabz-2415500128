import java.util.*;

public class NetworkPacketRouting {
    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("R1","R2");
        addEdge("R1","R3");
        addEdge("R2","R4");
        addEdge("R3","R4");
        addEdge("R4","R5");
        addEdge("R5","R6");

        System.out.println(isConnected());

        removeEdge("R4","R5");

        System.out.println(findPath("R1","R6"));

        System.out.println(minHops("R1","R6"));
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u,new ArrayList<>());
        graph.putIfAbsent(v,new ArrayList<>());
        graph.get(u).add(v);
        graph.get(v).add(u);
    }

    static void removeEdge(String u, String v) {
        graph.get(u).remove(v);
        graph.get(v).remove(u);
    }

    static boolean isConnected() {
        Set<String> vis = new HashSet<>();
        dfs("R1", vis);
        return vis.size() == graph.size();
    }

    static void dfs(String node, Set<String> vis) {
        vis.add(node);
        for (String nei : graph.get(node)) {
            if (!vis.contains(nei)) dfs(nei, vis);
        }
    }

    static boolean findPath(String start, String end) {
        Set<String> vis = new HashSet<>();
        return dfsPath(start, end, vis);
    }

    static boolean dfsPath(String curr, String end, Set<String> vis) {
        if (curr.equals(end)) return true;
        vis.add(curr);

        for (String nei : graph.get(curr)) {
            if (!vis.contains(nei)) {
                if (dfsPath(nei, end, vis)) return true;
            }
        }
        return false;
    }

    static int minHops(String start, String end) {
        Queue<String> q = new LinkedList<>();
        Map<String,Integer> dist = new HashMap<>();

        q.add(start);
        dist.put(start,0);

        while (!q.isEmpty()) {
            String node = q.poll();
            for (String nei : graph.get(node)) {
                if (!dist.containsKey(nei)) {
                    dist.put(nei, dist.get(node)+1);
                    q.add(nei);
                }
            }
        }
        return dist.getOrDefault(end,-1);
    }
}