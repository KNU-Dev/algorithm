import java.util.*;

class Solution {
    public int solution(int n, int[][] computers) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i=0; i<n; i++) {
            map.put(i, new LinkedList<Integer>());
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (i == j) continue;

                int u = computers[i][j];
                int v = computers[j][i];

                if (u==1 && v==1){
                    map.get(i).add(j);
                    map.get(j).add(i);
                }
            }
        }

        for(int i=0; i<n; i++) {
            Collections.sort(map.get(i));
        }

        Stack<Integer> s = new Stack<>();
        boolean[] visited = new boolean[n];

        int cnt = 0;
        for (int i=0; i<n; i++) {
            if (!visited[i]) {
                cnt++;
                s.push(i);

                while(!s.isEmpty()) {
                    int cur = s.pop();

                    if(visited[cur]) continue;
                    visited[cur] = true;

                    List<Integer> list = map.get(cur);

                    for(int j=list.size()-1; j>=0; j--) {
                        s.push(list.get(j));
                    }
                }
            }
        }

        return cnt;
    }
}