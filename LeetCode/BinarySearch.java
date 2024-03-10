package LeetCode;

public class BinarySearch {

    public int search(int[] nums, int target) {
        int first = 0;
        int last = nums.length-1;
       while(first <= last) {

           int m = first + (last-first)/2;
           if(nums[m] == target)
               return m;
           if(nums[m]> target) {
               last = m-1;
           }
           else {
               first = m+1;
           }
       }
        return -1;
    }


    public static void main(String[] args) {
        int []arr = {-1,0,3,5,9,12};
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.search(arr, 9));

    }
}
