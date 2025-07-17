
Optimized solution:
    1. create an temp array
    2. fill this temp array with non-duplicate array.
    3. assign back all the element in this array to original array
    4. return the count of non-duplicate from the temp array

optimal solution:
    1. instead of creating a new array, use the original array.
    2. iterate through all the elements and check if the ith element is same as rdth element,
        if they are same then move forward with continue
        if not same then forward rd by 1 and replace the value of rdth element with ith element.