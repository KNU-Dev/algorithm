class Solution {
    public String solution(String my_string, String letter) {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<my_string.length(); i++)
            if (!Character.toString(my_string.charAt(i)).equals(letter))
                sb.append(my_string.charAt(i));
        return sb.toString();
    }
}