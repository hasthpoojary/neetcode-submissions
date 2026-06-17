class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        char[] charss = t.toCharArray();
        Arrays.sort(charss);
        String x = new String(chars);
        String y= new String(charss);

        if(x.equals(y))
            return true;
            else
            return false;


    }
}
