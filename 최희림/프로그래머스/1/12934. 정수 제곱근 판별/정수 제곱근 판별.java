class Solution {
    public long solution(long n) {
        double m = Math.sqrt((double)n);

        if (m % 1 != 0) return -1;
        else return (long)(Math.pow(m+1, 2));
    }
}