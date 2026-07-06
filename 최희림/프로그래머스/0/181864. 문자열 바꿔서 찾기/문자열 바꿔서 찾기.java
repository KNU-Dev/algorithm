class Solution {
    public int solution(String myString, String pat) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<myString.length(); i++) {
            int c = myString.charAt(i);
            
            if (c == 'A') sb.append('B');
            else sb.append('A');
        } myString = sb.toString();
        
        for (int i=0; i<myString.length(); i++) {
            if (i + pat.length() <= myString.length() && myString.substring(i, i+pat.length()).equals(pat))
                return 1;
        }
        
        return 0;
    }
}