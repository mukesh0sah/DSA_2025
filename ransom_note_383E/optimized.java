class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {

        HashMap<Character,Integer> hm = new HashMap<>(); //create a hash table to store the frequency of characters in the magazine
        boolean result=true;
        for(char ch:magazine.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);    //populate the hm with the frequency of characters in the magazine
        }

        for(char ch : ransomNote.toCharArray()){
            if(hm.containsKey(ch) && hm.get(ch)>0){  //check if the character in the ransom note exists in the magazine and if its frequency is greater than 0
                hm.put(ch,hm.get(ch)-1);             //decrement the frequency of the character in the magazine
            }
            else{
                result=false;
            }
        }

        return result;


    }
}
