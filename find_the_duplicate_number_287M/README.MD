Brute-force:
    1. sort the array
    2. start a loop from 1 to n
    3. check if the current element is equal to the previous one
        if(nums[i]==nums[i-1]){
            return nums[i];
        }

Optimized-Solution:
    1. initialize a array with size of n
    2. check if the arr[nums[i]]==0, if true, then increase the element by 1.
        arr[nums[i]]++
    3. else
        result = nums[i]

Optimal solution(Floyd's algorithm)
    1. Start slow and fast variable with the value of first element
    2. move slow by 1 step and fast by 2 step until both of them meet.
    3. when both meet, then move fast to first element and now start moving both slow and fast by 1 step
    4. when both meet, that is the duplicate number. 