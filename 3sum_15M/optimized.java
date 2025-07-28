class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set <List<Integer>> result=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            Set <Integer> hs=new HashSet<>();
            for(int j=i+1;j<nums.length;j++){

                int sumK=-(nums[i]+nums[j]);

                if(hs.contains(sumK)){
                    Integer[] temp = {nums[i],nums[j],sumK};
                    Arrays.sort(temp);
                    result.add(Arrays.asList(temp));
                }
                hs.add(nums[j]);
            }
        }
        return new ArrayList(result);
    }
}