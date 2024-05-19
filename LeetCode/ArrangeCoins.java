package LeetCode;

public class ArrangeCoins {

    public int arrangeCoins(int n) {
        int i = 1; // which row we are on
        while(n > 0){ // checking to see if we have used all our coins
            i++; // increasing our row
            n = n-i; // adding coins to our row
        }
        return i-1;
    }

    public static void main(String[] args){
        ArrangeCoins arrangeCoins = new ArrangeCoins();
        System.out.println(arrangeCoins.arrangeCoins(2147483647));
    }
}
