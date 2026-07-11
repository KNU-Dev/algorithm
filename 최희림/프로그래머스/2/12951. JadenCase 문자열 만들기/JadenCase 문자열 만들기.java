class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int idx=0;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);

            if (c == ' ') idx=-1;
            if (idx == 0) {
                if ('a'<=c && c<='z') sb.append((char)(c - 'a' + 'A'));
                else sb.append(c);
            } else {
                if ('A'<=c && c<='Z') sb.append((char)(c - 'A' + 'a'));
                else sb.append(c);
            }

            idx++;
        }

        return sb.toString();
    }
}