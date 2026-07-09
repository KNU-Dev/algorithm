import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<a.length(); i++) {
            char c = a.charAt(i);
            
            if (c >= 'a' && c <= 'z')
                sb.append((char)(c - 'a' + 'A'));
            else
                sb.append((char)(c - 'A' + 'a'));
        }
        
        String answer = sb.toString();
        System.out.println(answer);
    }
}