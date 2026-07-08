class Solution {
    public long solution(int a, int b) {
        long answer = 0;
        
        int first = (a < b) ? a : b;
        int last = (a < b) ? b : a;
        
        for(int i=first; i<=last; i++) {
            answer += i;
        }
        
        return answer;
    }
}