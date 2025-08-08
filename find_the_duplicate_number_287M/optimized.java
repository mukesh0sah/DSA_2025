class Solution {
    public int findDuplicate(int[] nums) {
        int[] arr = new int[nums.length];
        int result=Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]]==0){
                arr[nums[i]]++;
            }
            else{
                result = nums[i] ;
            }
        }
        return result;

    }
}