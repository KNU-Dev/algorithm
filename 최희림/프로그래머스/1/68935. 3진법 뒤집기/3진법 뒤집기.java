class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.append(n % 3);
            n /= 3;
        }
        String s = sb.toString();

        int sum=0;
        for (int i=s.length()-1; i>=0; i--) {
            sum += (s.charAt(i) - '0') * (int)(Math.pow(3, s.length()-1-i));
        }
        
        // int sum = Integer.parseInt(s);
        
        return sum;
    }
}