Brute-force:
    1. Iterate through all the elements --> i = 0 to n
    2. Start another loop --> j = i+1 to n
    3. Check the condition
        nums[i]==nums[j] and also abs(i-j)<=k
    4. If condition is matched, return true

Optimal Solution:
    1. Start a Hashmap
    2. Iterate through all the elements and check for the condition
        If that number is already present in the hashmap and the value of abs of the hashmap value and current value of i is less than k the return true and break
    3. keep adding the elements in the hashmap