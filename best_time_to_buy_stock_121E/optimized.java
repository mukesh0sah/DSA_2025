
import java.util.Arrays;

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int maxProfit=0;
        int profit=0;
        int[] aux=new int[n];
        aux[n-1]=prices[n-1];
        for(int i=n-2;i>=0;i--){
            if(prices[i]>aux[i+1]){
                aux[i]=prices[i];
            }
            else{
                aux[i]=aux[i+1];
            }
        }
        for(int i=0;i<n;i++){
            profit=aux[i]-prices[i];
            if(profit>maxProfit){
                maxProfit=profit;
            }
        }
        return maxProfit;
    }
}


