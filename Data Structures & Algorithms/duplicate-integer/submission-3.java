class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums);
        int flag=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                flag=1;
            }
        }
        
        if(flag==1)
        return true;
        else
        return false;
        
    }
    
}