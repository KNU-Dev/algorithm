class Solution {
    public int solution(int a, int b) {
        int op = Integer.parseInt("" + a + b);
        int op2 = 2 * a * b;
        
        int answer = (op > op2) ? op : op2;
        return answer;
    }
}