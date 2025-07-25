class Solution {
    public int maxArea(int[] height) {
        int maxArea=0;
        int left=0;
        int right=height.length-1;
        while(left<right){
            int distance=right-left;
            int area=distance*Math.min(height[left],height[right]);
            if(area>maxArea){
                maxArea=area;
            }

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}