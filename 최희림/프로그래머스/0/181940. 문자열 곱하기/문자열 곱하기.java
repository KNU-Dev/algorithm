class Solution {
    public String solution(String my_string, int k) {
        StringBuilder sb = new StringBuilder();
        
        while(k-- > 0) {
            sb.append(my_string);
        }
        
        String answer = sb.toString();
        return answer;
    }
}