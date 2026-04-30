import java.util.*;

public class CoursePrerequisiteSystem {
    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        addEdge("CS101", "CS102");
        addEdge("CS101", "CS201");
        addEdge("CS102", "CS202");
        addEdge("MATH101", "CS201");

        System.out.println(hasCycle());

        System.out.println(getPrereq("CS202"));

        topoSort();
    }

    static void addEdge(String u, String v) {
        graph.putIfAbsent(u, new ArrayList<>());
        graph.get(u).add(v);
    }

    static boolean hasCycle() {
        Set<String> visited = new HashSet<>();
        Set<String> rec = new HashSet<>();

        for (String node : graph.keySet()) {
            if (dfsCycle(node, visited, rec)) return true;
        }
        return false;
    }

    static boolean dfsCycle(String node, Set<String> visited, Set<String> rec) {
        if (rec.contains(node)) return true;
        if (visited.contains(node)) return false;

        visited.add(node);
        rec.add(node);

        for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
            if (dfsCycle(nei, visited, rec)) return true;
        }

        rec.remove(node);
        return false;
    }

    static Set<String> getPrereq(String course) {
        Set<String> result = new HashSet<>();
        for (String node : graph.keySet()) {
            dfsPrereq(node, course, result, new HashSet<>());
        }
        return result;
    }

    static boolean dfsPrereq(String curr, String target, Set<String> res, Set<String> visited) {
        if (curr.equals(target)) return true;
        visited.add(curr);

        for (String nei : graph.getOrDefault(curr, new ArrayList<>())) {
            if (!visited.contains(nei)) {
                if (dfsPrereq(nei, target, res, visited)) {
                    res.add(curr);
                    return true;
                }
            }
        }
        return false;
    }

    static void topoSort() {
        Map<String, Integer> indeg = new HashMap<>();
        for (String u : graph.keySet()) {
            indeg.putIfAbsent(u, 0);
            for (String v : graph.get(u)) {
                indeg.put(v, indeg.getOrDefault(v, 0) + 1);
            }
        }

        Queue<String> q = new LinkedList<>();
        for (String k : indeg.keySet()) {
            if (indeg.get(k) == 0) q.add(k);
        }

        while (!q.isEmpty()) {
            String node = q.poll();
            System.out.print(node + " ");
            for (String nei : graph.getOrDefault(node, new ArrayList<>())) {
                indeg.put(nei, indeg.get(nei) - 1);
                if (indeg.get(nei) == 0) q.add(nei);
            }
        }
    }
}