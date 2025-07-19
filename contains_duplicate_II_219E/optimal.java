import java.util.*;
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        boolean result = false;

        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(nums[i]) && Math.abs(hm.get(nums[i])-i)<=k){
                result=true;
                break;
            }
            hm.put(nums[i],i);

        }
        return result;

    }
}