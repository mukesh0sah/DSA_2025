BRUTE-FORCE 1:
    1. Start an araylist and flatten the grid from 2d to 1d.
    2. sort the 1d array.
    3. Now, check if the previous element is same as the current element, if it is, the it is the repeating number.
    4. To calculate the missing number, first we find the sum of all the elements in the arrlist and another sum of all the element from 1 to N and then
        missingNumber=totalSum-(arrSum-repeatingNumber)

BRUTE-FORCE 2:
    1. Start an araylist and flatten the grid from 2d to 1d.
    2. sort the 1d array.
    3. Now we create a new array with length N+1
    4. increase the frequency for all the element from the flatten array.
    5. if arr[arrList.get(i)==0], then i is the missing number and if it is greater than 1 then it is the repeating numebr.

Optimal solution:
    1. first we flaten the grid, find the sum of all the element and also the sum of square of all the elements.
    3. We also calculate the sum of all the natural number from 1 to N and also the sum of square of all the natural numbers.
        expectedSum=n*(n+1)/2
        expectedSqSum=n*(n*1)*(2*n+1)/6
    4. then we calculate the difference of actual sum of elements and the expexted sum
        diff=arrSum-expectedSum
        sqDiff= arrSqSum-expectedSqSum
    5. then we will find sumXY=sqDiff/diff
    6. now, x=(diff+sumXY)/2
    7. y=sumXY-x
    