
import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int result=0;
        //to iterate through the HashMap use entrySet(). 
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){ // Iterate through the HashMap to calculate the number of good pairs
            int valueElement=entry.getValue();
            result += (valueElement *(valueElement-1))/2;
        }
        return result;
    }
}