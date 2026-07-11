class Solution {
    public String solution(String my_string, String alp) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.toString(c).equals(alp)) sb.append((char)(c - 'a' + 'A'));
            else sb.append(c);
        }
        
        return sb.toString();
    }
}