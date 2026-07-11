class Solution {
    public int solution(int order) {
        int answer = 0;
        String str = Integer.toString(order);
        
        for (int i=0; i<str.length(); i++) {
            switch(str.charAt(i)) {
                    case '3', '6', '9' -> answer++;
            }
        }
        
        return answer;
    }
}