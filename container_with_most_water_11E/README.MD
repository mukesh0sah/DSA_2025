Solution:
    1. Start a while loop with the condition where left is less than right. left being first index and right being last index.
    2.Find the distance
        distance=right-left;
    3. Find the area(Most important point)
        Area=distance*Min(left element, right element)
    4. check if the area is greater than maxArea, if it is then assign it to maxArea.
    5. if left element is lesser than right element then move the left pointer with plus one.
        else decrease the right by 1. 