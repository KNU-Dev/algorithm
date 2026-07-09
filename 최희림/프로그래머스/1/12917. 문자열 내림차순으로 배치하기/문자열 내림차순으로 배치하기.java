import java.util.Comparator;
import java.util.Arrays;

class Solution implements Comparator<Character> {
    @Override
    public int compare(Character a, Character b) {
        if (('A'<=a&&a<='Z') && ('a'<=b&&b<='z')) return b;
        return a-b;
    }
    
    public String solution(String s) {
        char[] arr = s.toCharArray();
        Arrays.sort(arr);

        StringBuilder sb = new StringBuilder(new String(arr));
        return sb.reverse().toString();
    }
}