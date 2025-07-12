import java.util.Arrays;
class Solution {
    public int majorityElement(int[] nums) {
        int votes=1;
        int majority=nums[0];
        for(int i=1;i<nums.length;i++){
            if(votes==0){
                votes++;
                majority=nums[i];
            }
            else if(majority==nums[i]){
                votes++;
            }
            else{
                votes--;
            }
        }
        return majority;
    }

}