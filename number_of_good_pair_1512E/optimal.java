
import java.util.*;
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int max=0;
        int result=0;
        for(int num:nums){
            max=Math.max(num,max);
        }
        int[] arr=new int[max+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
        }
        for(int num:arr){
            result += (num*(num-1))/2;
        }
        System.out.println(result);
        return result;

    }
}