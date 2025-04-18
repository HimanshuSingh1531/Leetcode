// class Solution {
//     public int maxSubarraySumCircular(int[] nums) {
        
//     }
// }
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int maxSum = nums[0];
        int minSum = nums[0];
        int totalSum = 0;
        int currMax = 0;
        int currMin = 0;
        
        // Compute total sum, max subarray sum, and min subarray sum
        for (int num : nums) {
            totalSum += num;
            
            // Max subarray sum (Kadane's Algorithm)
            currMax = Math.max(currMax + num, num);
            maxSum = Math.max(maxSum, currMax);
            
            // Min subarray sum (Modified Kadane's Algorithm)
            currMin = Math.min(currMin + num, num);
            minSum = Math.min(minSum, currMin);
        }
        
        // If totalSum == minSum, it means all numbers are negative, so max circular subarray is invalid
        if (totalSum == minSum) {
            return maxSum;
        }
        
        // Otherwise, return the max of the normal max subarray sum and the circular subarray sum
        return Math.max(maxSum, totalSum - minSum);
    }
}
