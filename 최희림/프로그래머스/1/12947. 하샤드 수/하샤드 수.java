class Solution {
    public boolean solution(int x) {
        int op = 0;
        
        String num = Integer.toString(x);
        for (int i=0; i<num.length(); i++) { op += num.charAt(i) - '0'; }
        
        return (x % op == 0) ? true : false;
    }
}