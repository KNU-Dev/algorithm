class Solution {
    public int solution(int price) {
        if (price >= 500_000) {
            price*=0.80;
        } else if (price >= 300_000) {
            price*=0.90;
        } else if (price >= 100_000) {
            price*=0.95;
        }

        return price;
    }
}