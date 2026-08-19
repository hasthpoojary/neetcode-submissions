class Solution {
    public int[] twoSum(int[] numbers, int target) {
        for(int i:numbers){
            for(int j:numbers){
                if((i+j)==target){
                    int a[]={i,j};
                    return a;
                }
            }
        }
    return new int[0];
    }
}
