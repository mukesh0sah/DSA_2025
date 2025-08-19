import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arr.add(grid[i][j]);
            }
        }
        Collections.sort(arr);
        int repeatingNumber=0;
        int arrSum=0;

        for(int i=1;i<arr.size();i++){
            if(arr.get(i-1)==arr.get(i)){
                repeatingNumber=arr.get(i);
            }
        }
        for(int i=0;i<arr.size();i++){
           arrSum=arrSum+arr.get(i);
        }

        int n=arr.size();
        int totalSum=(n*(n+1))/2;
        int missingNumber=totalSum-(arrSum-repeatingNumber);

        return new int[] {repeatingNumber,missingNumber};

    }
}