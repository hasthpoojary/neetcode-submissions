class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^a-zA-Z0-9]","");
        s=s.replace(" ","");
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        String a=sb.toString();
        if(s.equals(a)){
            return true;
        }else{
            return false;
        }

    }
}
