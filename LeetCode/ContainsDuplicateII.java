package LeetCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicateII {

    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for( int i=0;i< nums.length;i++){
            if( map.containsKey(nums[i]) && i - map.get(nums[i]) <= k)
                return true;
            map.put(i, nums[i]);
        }
        return false;


//        Set<Integer> container = new HashSet<>();
//        for ( int i= 0; i < nums.length; i++) {
//            if(i > k) {
//                container.remove(nums[i-k-1]);
//            }
//            if(container.contains(nums[i]))
//                return true;
//            container.add(nums[i]);
//        }
//        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,2,3};
        int k=2;
     ContainsDuplicateII containsDuplicateII = new ContainsDuplicateII();
     System.out.println(containsDuplicateII.containsNearbyDuplicate(nums, k));
    }
}
