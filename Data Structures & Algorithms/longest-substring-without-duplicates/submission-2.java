class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxlen = 0, l = 0, r = 0;
        HashSet<Character> set = new HashSet<>();
        while (r < s.length()) {
            if (set.contains(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            } else {
                set.add(s.charAt(r));
                r++;
                maxlen = Math.max(maxlen, r - l);
            }
        }
        return maxlen;
    }
}