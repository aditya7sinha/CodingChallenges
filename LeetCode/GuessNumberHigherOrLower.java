package LeetCode;

public class GuessNumberHigherOrLower {

    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while(low <= high){
            int mid = low+(high - low)/2;
            int pick = guess(mid);
            if(pick > 0) low = mid+1;
            else if(pick < 0) high = mid - 1;
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args){

    }
}
