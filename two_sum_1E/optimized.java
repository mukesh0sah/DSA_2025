import java.util.*;
class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> hm = new HashMap<>();
        int element=0;
        int targetValue=0;
        int[] arr=new int[2];

        for(int i=0;i<nums.length;i++){
            element = nums[i];
            targetValue=target-element;
            if(hm.containsKey(targetValue)){
                arr[0]=i;
                arr[1]=hm.get(targetValue);
            }

            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }


        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}