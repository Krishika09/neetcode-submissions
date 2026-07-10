class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set <Integer> num1=new HashSet<>();

        for(int num:nums){
            if(num1.contains(num)){
                return true;
            }
            num1.add(num);
        }
        return false;
    }
}