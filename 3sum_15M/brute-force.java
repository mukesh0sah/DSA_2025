class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set <List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        Integer[] temp = {nums[i],nums[j],nums[k]};
                        Arrays.sort(temp);
                        result.add(Arrays.asList(temp));
                    }
                }
            }
        }
        return new ArrayList(result);

    }
}