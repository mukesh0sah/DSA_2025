class Solution {
    public int findDuplicate(int[] nums) {
        int slow=nums[0],fast=nums[0];
        do{
            slow = nums[slow]; //moves one time
            fast = nums[nums[fast]]; //moves two time
        }while(slow!=fast);
        //when they meet, move fast to first element and move both with same speed
        fast=nums[0];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return fast;
    }
}