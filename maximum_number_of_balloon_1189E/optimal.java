class Solution {
    public int maxNumberOfBalloons(String text) {
        int b = 0, a = 0, l = 0, o = 0, n = 0; // Initialize counts for each character in "balloon"

        for (char ch : text.toCharArray()) {
            switch (ch) { // Count occurrences of each character
                case 'b': b++; break;
                case 'a': a++; break;
                case 'l': l++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }

        // 'l' and 'o' appear twice in "balloon"
        l /= 2;
        o /= 2;

        return Math.min(Math.min(Math.min(b, a), l), Math.min(o, n)); // Return the minimum count among the characters divided by their required frequency(To remember this, simply write balon and add math.min in last two and first two and last two characters)
    }
}