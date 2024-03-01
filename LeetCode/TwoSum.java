package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for( int i =0 ;i < nums.length-1; i++){
            for(int j=i+1; j< nums.length;j++){
                if((target - nums[i]) == nums[j]){
                    arr[0]= i;
                    arr[1]= j;
                    return arr;
                }
            }
        }
        return arr;
    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int nums[] = {}
//        int target =
//        System.out.println(twoSum(nums, target));
//    }
}
