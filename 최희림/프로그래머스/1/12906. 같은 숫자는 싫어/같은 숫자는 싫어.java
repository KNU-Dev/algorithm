import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> dq = new LinkedList<>();

        for (int i : arr) {
            if (dq.isEmpty() || dq.peekLast() != i) dq.addLast(i);
        }

        int[] answer = new int[dq.size()];
        for (int i=0; i<answer.length; i++) {
            answer[i] = dq.pollFirst();
        }

        return answer;
    }
}