class Solution {
    public int solution(int[] numbers) {
        int[] num = new int[10];
        for (int i : numbers) num[i]++;
        
        int result = 0;
        for (int i=0; i<num.length; i++) 
            if (num[i] == 0)
                result += i;
        
        return result;
    }
}