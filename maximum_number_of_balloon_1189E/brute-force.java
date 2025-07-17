import java.util.*;
class Solution {
    public int maxNumberOfBalloons(String text) {

        HashMap<Character, Integer> ht = new HashMap<>(); //create a hash table to store the frequency of characters in the input text
        HashMap<Character, Integer> counterHt = new HashMap<>(); //create a hash table to store the frequency of characters in the word "balloon"
        char ct;
        String temp = "balloon";
        for(int i=0;i<temp.length();i++){
            counterHt.put(temp.charAt(i),counterHt.getOrDefault(temp.charAt(i),0)+1); //populate the counterHt with the frequency of characters in "balloon"
        }

        System.out.println(counterHt);

        for(int i=0;i<text.length();i++){
            ht.put(text.charAt(i),ht.getOrDefault(text.charAt(i),0)+1); //populate the ht with the frequency of characters in the input text
        }
        int result=Integer.MAX_VALUE;
        for (char c : counterHt.keySet()) {
            result = Math.min(result, ht.getOrDefault(c, 0) / counterHt.get(c)); //for each character in "balloon", find the minimum number of times it can be formed from the input text
        }

        return result;
    }
}