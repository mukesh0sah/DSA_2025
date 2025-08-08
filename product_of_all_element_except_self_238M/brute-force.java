class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            int mult=1;
            for(int j=0;j<n;j++){

                if(i==j){
                    continue;
                }
                else{
                    mult=mult*nums[j];
                }
            }
            arr[i]=mult;
        }
        return arr;
    }
}