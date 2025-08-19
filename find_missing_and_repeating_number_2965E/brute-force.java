import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {




        int repeatingNumber=0;
        int missingNumber=0;
        ArrayList<Integer> arrList = new ArrayList<>();


        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                arrList.add(grid[i][j]);
            }
        }
        int n=arrList.size();
        int[] arr = new int[n+1];


        for(int i=0;i<arrList.size();i++){
            arr[arrList.get(i)]++;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(arrList);
        for(int i=1;i<arr.length;i++){
            if(arr[i]==0){
                missingNumber=i;
            }
            if(arr[i]>1){
                repeatingNumber=i;
            }
        }

        return new int[] {repeatingNumber,missingNumber};



    }
}