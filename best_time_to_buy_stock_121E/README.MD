Brute-force:
    1. Iterate through each elements in the array Prices.
    2. Check the profit of that day by initiating another loop.
    3. If the profit is greater that maxProfit, then assign profit to maxprofit.

Optimized:
    1. Create an aux array and fill the last element of the aux array with the last element in the prices array.
        aux[n-1]=prices[n-1]
    2. Now iterate from the second last element of the prices array to zero.
        for(int i=n-2;i>=0;i--)
    3. Compare, if the element at current iteration is same as that of the element at (i+1)th position in aux array.
        if(prices[i]==aux[i+1])

        then replace the aux[i] with prices[i]
        else copy the previous element of the aux array to current on
        aux[i]=aux[i+1]
    4. Now that we have an aux array, which is basically the selling prices of that day to make the maximum profit.
    5. Start another loop and compare the element of both the array and if the profit is greater than maxProfit then assign it to maxProfit.

Optimal:
    1. Iterate through all the element in the prices array.
    2. check for the minimum proce, by comparing the element(price[i]) with minPrice and assigning the minimum among both to minPrice.
        minPrice=Math.min(prices[i],minPrice)
    3. check the profit
        profit=prices[i]-minPrice
    4. Check for the maxProfit
        maxProfit = Math.max(profit,maxProfit)