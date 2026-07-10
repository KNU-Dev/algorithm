class Solution {
    public int solution(String str1, String str2) {
        for (int i=0; i<=str1.length()-str2.length(); i++) {
            if ((str1).startsWith(str2, i)) return 1;
        }

        return 2;
    }
}