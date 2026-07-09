class Solution {
    public int solution(int[] num_list) {
        int a = 1, b = 0;
        
        for (int i=0; i<num_list.length; i++) {
            a *= num_list[i];
        }
        
        for (int i=0; i<num_list.length; i++) {
            b += num_list[i];
        } b *= b;
        
        int answer = (a < b) ? 1 : 0;
        return answer;
    }
}