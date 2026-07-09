class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if ('a' <= c && c <= 'z') sb.append((char)(c - 'a' + 'A'));
            if ('A' <= c && c <= 'Z') sb.append((char)(c - 'A' + 'a'));
        }
        return sb.toString();
    }
}