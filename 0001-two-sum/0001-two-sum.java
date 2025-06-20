//Brute Force Approch
 class Solution {
   public int[] twoSum(int[] nums, int target) {
      for(int i = 0; i < nums.length-1; i ++){
          for (int j = i + 1; j < nums.length; j++){
                        int Array[] = {i,j};
             if(nums[i] + nums [j] == target){
                 //int Array[] = {i,j};
                 return Array;
              }        
                  }
      }
      return null;
        
        
    }
 }