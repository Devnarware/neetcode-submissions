class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length ;

        int[] ans = new int[n];
        int count = 0;
        int mul = 1;

        for(int i = 0; i<n; i++){
            if(nums[i] != 0){
                mul = mul * nums[i];
            }else{
                count++;
            }
        }

        if(count > 1){
            return ans;
        }else if(count == 1){
            for(int i = 0; i<n; i++){
                if(nums[i] != 0){
                    ans[i] = 0;
                }else{
                    ans[i] = mul;
                }
            }
        }else{
            for(int i = 0; i<n; i++){
                ans[i] = mul/nums[i] ;
            }
        }

        return ans;
    }
}  
