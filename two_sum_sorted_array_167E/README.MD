Solution:
    1. Start two pointer left and right. Left pointed to the first element while right is pointing to the last element.
    2. Start a while loop till left < right and check if the sum of the left element and the right element is equal or not. If they are equal, then return the array with left+1 and right+1;
    3. else if the sum is greater than the target, then decrease the right by 1.
    4. else increase the left by 1. 