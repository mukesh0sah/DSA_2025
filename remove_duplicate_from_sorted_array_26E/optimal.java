class Solution {
    public int removeDuplicates(int[] nums) {
        int[] temp=new int[nums.length];
        temp[0]=nums[0];
        int rd=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==temp[rd]){
                continue;
            }
            else{
                rd++;
                temp[rd]=nums[i];

            }
        }

        for(int i=0;i<=rd;i++){
            nums[i]=temp[i];
        }
        return rd+1;
    }
}