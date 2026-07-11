class Solution {
    public String solution(String rsp) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<rsp.length(); i++) {
            char c = switch(rsp.charAt(i)) {
                    case '2' -> '0';
                    case '0' -> '5';
                    case '5' -> '2';
                    default -> '1';
            };
            
            sb.append(c);
        }
        
        return sb.toString();
    }
}