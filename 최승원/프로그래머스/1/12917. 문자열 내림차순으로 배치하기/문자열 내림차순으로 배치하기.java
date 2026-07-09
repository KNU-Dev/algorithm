import java.util.Arrays;
import java.util.Comparator;

/**
 * Arrays.sort() 메서드를 사용하라는 느낌을 받아서 Comparator.reverseOrder()를 사용해야겠다고 생각했다.
 * 우선 Arrays.sort(s.toCharArray())는 char[]를 매개변수로 받는 메서드이므로 기존 문자열 s를 그냥 toCharArray()로 변환하면 된다.
 * 하지만 Comparator.reverseOrder()를 사용하기 위해서는 char[]가 아닌 Character[]로 변환해야 한다.
 * 그래서 s.chars()를 사용하여 IntStream을 만들고, mapToObj()를 사용하여 char로 변환한 후, toArray()를 사용하여 Character[]로 변환했다.
 * 그 후, Arrays.sort(charArray, Comparator.reverseOrder())를 사용하여 내림차순으로 정렬했다.
 */
class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        Character[] charArray = s.chars()
                .mapToObj(c -> (char) c)
                .toArray(Character[]::new);

        Arrays.sort(charArray, Comparator.reverseOrder());

        for (char c : charArray) {
            answer.append(c);
        }

        return answer.toString();
    }
}
