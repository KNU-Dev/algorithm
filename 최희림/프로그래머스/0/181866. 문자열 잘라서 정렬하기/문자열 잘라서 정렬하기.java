import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i=0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                if (sb.length() > 0) {
                    list.add(sb.toString());
                }
                sb.setLength(0);
                continue;
            }
            sb.append(myString.charAt(i));
        }

        if (!sb.toString().equals("")) list.add(sb.toString());
        list.sort(null);

        return list.toArray(new String[list.size()]);
    }
}