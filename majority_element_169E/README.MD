Brute-force:
    1. Sort the array
    2. for all the elements, check the occurance and return the one with the highest count of occurance.

optimized:
    1. sort the array.
    2. The majority element will always pass through the center.

optimal:
    1. To start, let the first element be majority with vote = 1.
    2. if the element==majority, increase the count by one.
    3. if the element != majority, decrease the vote count.
        1. if the voce becomes zero, update the majority element.
        2. set votes=1, for the newer element