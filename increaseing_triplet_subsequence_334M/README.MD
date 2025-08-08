Brute-force:
    1. start 3 nested loop.
        i-> 0 to n
        j-> i+1 to n
        k-> j+1 to n
    2. check if
        nums[i] is less than nums[j] and
        nums[j] is less than nums[k]
    3. if condition satisfied, return true

Optimized-solution:
    1. Initialize two interger, first and second, with value Interger.MAX_VALUE
    2. check if nums[i] is less than or equal to first, if true, first=nums[i]
    3. check else if nums[i] is less than or equal to second, if true, second=nums[i]
    4. else return the flat to true. 
