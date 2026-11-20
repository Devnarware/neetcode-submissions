class Solution {
    public boolean hasDuplicate(int[] nums) {
        Arrays.sort(nums) ;
        int n = nums.length ;
        for(int i = 0 ; i + 1 < n ; i++){
            if(nums[i] == nums[i+1]){
                return true ;
            }
        }
        return false ;
    }
}