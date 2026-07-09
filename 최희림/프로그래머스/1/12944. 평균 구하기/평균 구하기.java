class Solution {
    public double solution(int[] arr) {
        double avg = 0;
        for (int i : arr) { avg += i; }
        return avg/arr.length;
    }
}