class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];
        for (char c : magazine.toCharArray()) { // Count occurrences of each character in the magazine
            count[c - 'a']++;                // Convert character to index (0-25) and increment count
        }
        for (char c : ransomNote.toCharArray()) {
            if (--count[c - 'a'] < 0) return false;       // Decrement count for each character in ransomNote and check if it goes below zero
        }
        return true;
    }
}