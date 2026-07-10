import java.util.Arrays;
import java.util.List;

class Solution {
    public int solution(String[] s1, String[] s2) {
        List<String> list = Arrays.stream(s1).toList();

        int cnt = 0;
        for (String s : s2) {
            if (list.contains(s)) cnt++;
        }

        return cnt;
    }
}