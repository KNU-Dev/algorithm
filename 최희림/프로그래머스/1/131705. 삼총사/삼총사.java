class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        for (int i=0; i<number.length; i++) {
            for (int j=i+1; j<number.length; j++) {
                for (int o=j+1; o<number.length; o++) {
                    if (number[i] + number[j] + number[o] == 0) {
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}