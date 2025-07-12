import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int current=Integer.MIN_VALUE;
        int maximum_count=0;
        int maximum_occurance=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>current){
                current=nums[i];
                count=1;
            }
            else if(nums[i]==current){
                count++;
            }
            if(count>maximum_count){
                    maximum_count=count;
                    maximum_occurance=nums[i];
            }
        }
        return maximum_occurance;
    }

}