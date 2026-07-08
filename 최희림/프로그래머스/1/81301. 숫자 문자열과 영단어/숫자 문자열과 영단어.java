class Solution {
    public int solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        for (int i=0; i<s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sb.append(s.charAt(i));
                continue;
            }
            if (i + 3 <= s.length()) {
                switch (s.substring(i,i+3)) {
                    case "one" -> { sb.append('1'); i+=2; }
                    case "two" -> { sb.append('2'); i+=2; }
                    case "six" -> { sb.append('6'); i+=2; }
                }
            }
            if (i + 4 <= s.length()) {
                switch (s.substring(i, i+4)) {
                    case "zero" -> { sb.append('0'); i+=3; }
                    case "four" -> { sb.append('4'); i+=3; }
                    case "five" -> { sb.append('5'); i+=3; }
                    case "nine" -> { sb.append('9'); i+=3; }
                }
            }
            if (i + 5 <= s.length()) {
                switch (s.substring(i, i+5)) {
                    case "three" -> { sb.append('3'); i+=4; }
                    case "seven" -> { sb.append('7'); i+=4; }
                    case "eight" -> { sb.append('8'); i+=4; }
                }
            }
        }
        
        return Integer.parseInt(sb.toString());
    }
}