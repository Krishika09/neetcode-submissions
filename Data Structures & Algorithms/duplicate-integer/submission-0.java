class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Boolean> num1=new HashMap<>();

        for(int num:nums){
            if(num1.containsKey(num)){
                return true;
            }
            else{
                num1.put(num,true);
            }
        }
        return false;
    }
}