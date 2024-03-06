package LeetCode;

import java.util.Arrays;

public class MinimumDifference {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        int a = 0, b=k-1;
        while(b<nums.length){
            if((nums[b]-nums[a])<min) {
                min = (nums[b]-nums[a]);
            }
            a++;
            b++;
        }
        return min;
    }
    public static void main(String[] args) {
        MinimumDifference minimumDifference = new MinimumDifference();
        int nums[] ={9,4,1,7}, k=2;
        System.out.println(minimumDifference.minimumDifference(nums,k));
    }
}
