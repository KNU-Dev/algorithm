class Solution {
    public int[] solution(int n, int m) {
        int mul = n * m;
        int flag = 0;
        
        for (int i=1; i<=((n>m)?m:n); i++) {
            if (n%i==0 && m%i==0) {
                flag = i;
            }
        }
        
        return new int[]{ flag, mul/flag };
    }
}