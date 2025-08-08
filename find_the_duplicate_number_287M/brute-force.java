class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int result=Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                result=nums[i];
            }
        }
        return result;

    }
}