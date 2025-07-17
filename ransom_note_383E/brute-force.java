class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> hr = new HashMap<>();  //create a hash table to store the frequency of characters in the ransom note
        HashMap<Character,Integer> hm = new HashMap<>();  //create a hash table to store the frequency of characters in the magazine
        boolean result=true;

        for(char ch:ransomNote.toCharArray()){
            hr.put(ch,hr.getOrDefault(ch,0)+1);   //populate the hr with the frequency of characters in the ransom note
        }

        for(char ch:magazine.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);  //populate the hm with the frequency of characters in the magazine
        }

        for(char ch:ransomNote.toCharArray()){
            if(!(hm.containsKey(ch) && hr.get(ch)<=hm.get(ch))){ //check if the character in the ransom note exists in the magazine and if its frequency is less than or equal to that in the magazine
                result= false;
                break;
            }
        }
        return result;
    }
}
