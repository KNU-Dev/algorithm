import java.util.HashMap;

class Solution {
    public int solution(int[] array, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : array) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        return map.getOrDefault(n, 0);
    }
}