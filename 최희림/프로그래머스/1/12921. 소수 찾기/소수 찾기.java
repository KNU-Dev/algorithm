class Solution {
    
    public int solution(int n) {
        boolean[] flag = new boolean[n+1];
        
        for (int i=0; i<n+1; i++) flag[i] = true;
        flag[0] = false; flag[1] = false;
        
        for (int i=2; i<=n+1; i++) {
            for (int j=2; j*i<n+1; j++) {
                flag[i*j] = false;
            }
        }
        
        int answer = 0;
        for (int i=1; i<=n; i++) {
            if (flag[i]) answer++;
        }
        
        return answer;
    }
}