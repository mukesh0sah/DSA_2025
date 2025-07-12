class Solution {
    public void moveZeroes(int[] nums) {
        int countZero=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[countZero]=nums[i];
                countZero++;
            }
        }
        while(countZero<nums.length){
            nums[countZero]=0;
            countZero++;
        }
    }
}