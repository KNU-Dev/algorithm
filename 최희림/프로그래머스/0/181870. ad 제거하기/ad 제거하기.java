import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();

        for (String s : strArr) {
            if (!s.contains("ad")) list.add(s);
        }
        
        String[] arr = list.toArray(new String[list.size()]);
        
        for (int i=0; i<arr.length; i++) {
            arr[i] = list.get(i);
        }

        return arr;
    }
}