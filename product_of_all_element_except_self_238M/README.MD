Brute-force:
    1. create a new array with the same length of nums
    2. start a loop i-> 0 to n
    3. start another loop j-> 0 to n
    4. if(i==j).... continue
    5. else mult = mult * nums[i]
    6. assign arr[i]=mult.

Optimul solution:
    1. create a res array and assign res[0]=1
    2. take the multiple of all the left element and store them in array res.
        for(int i=1;i<n;i++){
            res[i]=res[i-1]*nums[i-1]
        }

    3. to calculate the right rum.
        initiate a variable right =1
        for(int i=n-1;i>=0;i--){
            res[i]=res[i]*result;
            result *= nums[i];
        }
    4. return res