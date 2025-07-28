Brute-force:
    1. Start a loop i-> 0 to n
    2. Second loop j-> i+1 to n
    3. Thirt loop k-> j+1 to n
    4. Check if the sum of all the element in these indices is equal to zero.
    5. if it is there, create an arrya of these element, sort the element to avoid duplicacy.
        Integer[] temp = {nums[i],nums[j],nums[k]};
        Arrays.sort(temp);
        result.add(Arrays.asList(temp));

Optimized solution:
    1. Start a loop i-> 0 to n
    2. Second loop j-> i+1 to n
    3. Since, we are looking for a third variable whose sum will be -(nums[i]+nums[k])
    4. So, we can use hashset.

        1. we will check if the third element which we are looking for is present in the hashset or not. if it is there then we can conclude that this is the third element we are looking for.
        2. Add the jth element int he set and move on

Optimized solution:
    1. Sort the array.
    2. Start the first loop i-> 0 to n
    3. if the previous element is same then skip this iteration and continue.
    4. take left as i+1 and right as last element i.e. nums.length-1
    5. start a while loop for (left<right)
        1. if the sum of nums[i], nums[left] and nums[right] is equals to zero then we will add these three element in the set.
        2. We will then check if the next element of left element is duplicate on or not. if it is then increase left by 1.
            while (left < right && nums[left] == nums[left + 1]) left++;

        3. Similarly, check for the duplicate if the previous element fromt he right element is same or not. if it is then decrease it by 1.
            while (left < right && nums[right] == nums[right - 1]) right--;
        4. increase left by one and decrease rigth by 1.
        5. If (sum<0),
            left++
        else
        rigth --