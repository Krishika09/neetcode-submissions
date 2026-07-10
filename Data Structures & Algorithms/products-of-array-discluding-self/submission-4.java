class Solution {
    public int[] productExceptSelf(int[] nums) {
        int i,j;
        int output[]=new int[nums.length];
        for(i=0;i<nums.length;i++){
            int prod=1;
            for(j=0;j<nums.length;j++){
                if(i!=j){
                    prod=prod*nums[j];
                }
            }
            output[i]=prod;
        }
        return output;
    }
}  
