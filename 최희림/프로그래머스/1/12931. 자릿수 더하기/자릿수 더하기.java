import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int op = 100_000_000;
        
        for (int i=0; i<9; i++) {
            answer += n / op;
            n %= op;
            op /= 10;
        }

        return answer;
    }
}