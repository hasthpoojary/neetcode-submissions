class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] last = new int[256];
        int l = 0, maxlen = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);

            if (last[c] > l) {
                l = last[c];
            }

            last[c] = r + 1;
            maxlen = Math.max(maxlen, r - l + 1);
        }

        return maxlen;
    }
}