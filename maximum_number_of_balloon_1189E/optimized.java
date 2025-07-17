import java.util.*;
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> ht = new HashMap<>();
        char ct;
        String temp = "balloon";
        for(int i=0;i<temp.length();i++){
            ht.put(temp.charAt(i),0); // Initialize the frequency of characters in "balloon" to 0
        }

        for(int i=0;i<text.length();i++){
            ct=text.charAt(i);
            if(ht.containsKey(ct)){
                ht.put(ct,ht.get(ct)+1); // Increment the frequency of characters in the input text
            }
        }
        int countB=ht.get('b');
        int countA=ht.get('a');
        int countL=ht.get('l');
        int countO=ht.get('o');
        int countN=ht.get('n');

        int[] vals = {countB / 1, countA / 1, countL / 2, countO / 2, countN / 1}; // Calculate the number of times each character can contribute to forming the word "balloon"
        int min1 = Integer.MAX_VALUE;

        for (int val : vals) {
            min1 = Math.min(min1, val); // Find the minimum value among the calculated values
        }

        return min1;

    }
}