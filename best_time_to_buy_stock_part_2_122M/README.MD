SOlution:
    1. If today's price is greater than yesterday's price then it is always
        profitable to buy yesterday and sell it today.

        if(price[i]>price[i-1]){
            profit = profit + (prices[i]-prices[i-1])
        }
    