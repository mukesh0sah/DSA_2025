Brute-force
    1. Start an loop to iterate through all the elements --> i
    2. Start another loop starting from i+1 --> j
    2. check if nums[i]==nums[j], if it is same, then increase the result count by 1.

Optimized:
    1. Define an hashmap and store all the elements with their occurance count <element, occurance>
    2. iterate through all the element in hashmap
        To iterate,
        for(Map.Entry<Integer,Integer> entry: hm.entrySet())
    3. Now calculate the number of good pairs that can be formed with each elements using this formula
        result= n+(n-1)/2
    4. Add all the results and that's our answer

Optimal (using array):
    1. Initialize an empty array (arr) with the size of max element in the nums
    2. increase the index in arr for all the occurance of the element in num
    3. now use result= n+(n-1)/2 formula to calcuate the result iterating through all the elements in arr