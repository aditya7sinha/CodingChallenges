package LeetCode;

import java.util.Scanner;

public class GuessNumberHigherOrLower {
    public int guess (int num) {
        Scanner sc = new Scanner(System.in);
        int pick = sc.nextInt();
        if(pick>num){
            return 1;
        }
        else if (pick < num)
        {
            return -1;
        }
        return 0;
    }
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
