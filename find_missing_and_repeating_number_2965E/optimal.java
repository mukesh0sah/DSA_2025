import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {

        int n=grid.length * grid.length;
        long arrSum=0;
        long arrSqSum=0;

        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int val=grid[i][j];
                arrSum += val;
                arrSqSum += (long) val * val;
            }
        }

        long expectedSum = (long) n * (n + 1) / 2;
        long expectedSqSum = (long) n * (n + 1) * (2 * n + 1) / 6;

        long diff = arrSum - expectedSum; // x - y
        long sqDiff = arrSqSum - expectedSqSum; //x2-y2 = (x-y)(x+y)

        long sumXY = sqDiff / diff; // x + y

        long x = (diff + sumXY) / 2; // repeating
        long y = sumXY - x;
        return new int[]{(int) x, (int) y};

    }
}