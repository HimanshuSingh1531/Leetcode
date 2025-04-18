class Solution {
    public int maxProduct(int[] nums) {
        long ans = Integer.MIN_VALUE;
        long prefix = 1;
        long sufix = 1;
        for(int i = 0; i<nums.length; i++){
            if(prefix == 0){
                prefix = 1;
            } 
            if(sufix == 0){
                sufix = 1;
            }
            prefix*=nums[i];
            sufix*=nums[nums.length - i - 1];
            ans = Math.max(ans,Math.max(prefix,sufix));
        }
        return (int) ans;
        
    }
}