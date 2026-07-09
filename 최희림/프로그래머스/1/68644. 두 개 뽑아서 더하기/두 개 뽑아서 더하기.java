class Solution {
    public int[] solution(int[] numbers) {
        int[] numArr = new int[201];
        
        int length = 0;
        for (int i=0; i<numbers.length; i++) {
            for (int j=i+1; j<numbers.length; j++) {
                if (numArr[numbers[i] + numbers[j]] == 0) length++;
                numArr[numbers[i] + numbers[j]]++;
            }
        }
        
        int idx = 0;
        int[] answer = new int[length];
        for (int i=0; i<numArr.length; i++) {
            if (numArr[i] != 0) {
                answer[idx++] = i;
            }
        }
        
        return answer;
    }
}