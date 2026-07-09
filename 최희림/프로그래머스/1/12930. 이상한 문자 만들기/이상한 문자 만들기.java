class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        int idx = 0;
        for (int i=0; i<s.length(); i++) {
            String c = Character.toString(s.charAt(i));
            if (c.equals(" ")) idx = 1;
            
            sb.append((idx % 2 == 0) ? c.toUpperCase() : c.toLowerCase());
            idx++;
        }
        
        return sb.toString();
    }
}