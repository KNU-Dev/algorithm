class Solution {
    public int solution(String s) {
        int answer = 0;
        
        answer = switch(s.charAt(0)) {
                case '+' -> Integer.parseInt(s.substring(1));
                case '-' -> -Integer.parseInt(s.substring(1));
                default -> Integer.parseInt(s);
        };
        
        return answer;
    }
}