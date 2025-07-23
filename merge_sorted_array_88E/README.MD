SOlution.
    1. Start 3 pointers. keep the pointer at
        1. End of the array nums1 (n-1) ->  i
        2. End of the array nums2 (m-1) -> j
        3. End of the sum of m and n (m + n-1) -> k
    2. Check if the element at ith index in nums1 is greater than jth element in nums2. if it is then assign nums[i] to nums[k] and decrease the pointer i by 1.
        if(nums1[i]>nums2[j]){
            nums1[k]=nums[i]
            i--;
        }
    3. if it is not greater then assign nums2[j] to nums1[k].and decrease the pointer j by 1.
        nums1[k]=nums[j]
    4. Decrease the count of k by 1
    5. Repeat this while loop until j>=0 and i>=0;

    6. Start another while loop to check if there's any element left in nums2
        1. if it is there, then assign all the element to nums[k] and keep decreaseing both j and k by 1. 
