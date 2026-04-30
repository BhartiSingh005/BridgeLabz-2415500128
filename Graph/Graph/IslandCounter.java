import java.util.*;

public class IslandCounter {
    static int[][] grid = {
        {1,1,0,0,0},
        {1,1,0,0,1},
        {0,0,1,0,1},
        {0,0,0,1,1}
    };

    static int n = grid.length;
    static int m = grid[0].length;

    public static void main(String[] args) {
        System.out.println(countDFS());
        System.out.println(countBFS());
    }

    static int countDFS() {
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    dfs(i, j, vis);
                    count++;
                }
            }
        }
        return count;
    }

    static void dfs(int i, int j, boolean[][] vis) {
        if (i < 0 || j < 0 || i >= n || j >= m || vis[i][j] || grid[i][j] == 0) return;

        vis[i][j] = true;

        dfs(i+1, j, vis);
        dfs(i-1, j, vis);
        dfs(i, j+1, vis);
        dfs(i, j-1, vis);
    }

    static int countBFS() {
        boolean[][] vis = new boolean[n][m];
        int count = 0;

        int[] dx = {1,-1,0,0};
        int[] dy = {0,0,1,-1};

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1 && !vis[i][j]) {
                    Queue<int[]> q = new LinkedList<>();
                    q.add(new int[]{i,j});
                    vis[i][j] = true;

                    while (!q.isEmpty()) {
                        int[] cur = q.poll();
                        for (int k = 0; k < 4; k++) {
                            int ni = cur[0] + dx[k];
                            int nj = cur[1] + dy[k];

                            if (ni>=0 && nj>=0 && ni<n && nj<m && grid[ni][nj]==1 && !vis[ni][nj]) {
                                vis[ni][nj] = true;
                                q.add(new int[]{ni,nj});
                            }
                        }
                    }
                    count++;
                }
            }
        }
        return count;
    }
}