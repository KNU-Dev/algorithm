class Solution {
    public int solution(int[] sides) {
        boolean flag = false;
        
        int a = sides[0], b = sides[1], c = sides[2];
        
        if ((a>=b&&a>=c)&&(a<b+c)) flag=true;
        if ((b>=a&&b>=c)&&(b<c+a)) flag=true;
        if ((c>=a&&c>=b)&&(c<a+b)) flag=true;
        
        return (flag)?1:2;
    }
}