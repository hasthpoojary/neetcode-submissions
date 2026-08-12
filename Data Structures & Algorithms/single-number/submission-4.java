class Solution {
    public int singleNumber(int[] nums) {
        int h=0;
     for(int i:nums){
        h^=i;
     }  
     return h; 
    }
}
