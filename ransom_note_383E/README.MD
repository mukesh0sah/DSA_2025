BRUTE-FORCE:
    1. Create-two hashmap with all the elements in magazine and ransomnote.
    2. check if the character in the ransom note exists in the magazine and if its frequency is less than or equal to that in the magazine.
        If this condition is not satified, then return false.

Optimized:
    1. Since we were using two hashmap, so we can optimize it by creating only one hashmap with all the elements in magazine.
    2. check if the character in the ransom note exists in the magazine and if its frequency is greater than 0
    2. if it exist, we decrease the count in the hashmap by one else we return false.

Optimal:
    1. Create an arrray of size 26 as all the letter in magzine is small case letter.
    2. Count occurrences of each character in the magazine
    3. Convert character to index (0-25) and increment count
         count[c - 'a']++;
    4. Decrement count for each character in ransomNote and check if it goes below zero and if it goes below zero, then return false. 

