import java.util.*;

/**
 * 배열에 대해 반복을 수행하며, List 내 마지막 원소와 비교한 후 같지 않으면 List에 추가하는 방식으로 문제를 해결했다.
 * 처음 문제를 읽어봤을 때, 떠오른 해결 방법은 입력 배열 arr 반복문 내, answer 반복을 돌려 원소를 비교하여 같은 원소가 없으면 answer에 추가하는 방식이었다.
 * 하지만, 이 방법은 비교할 필요 없는 원소까지 비교를 하는 비효율적인 방법이란 것을 후에 인지했고, list.getLast()를 이용하여 마지막 원소만 비교하여 해결하는 방식으로 접근했다.
 */
public class Solution {
    public List<Integer> solution(int []arr) {
        List<Integer> answer = new ArrayList<>();

        answer.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (answer.getLast() != arr[i]) {
                answer.add(arr[i]);
            }
        }

        return answer;
    }
}
