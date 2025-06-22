class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // Start with first element
        int maxSum = nums[0];     // Initialize max with first element

        // Loop through the array starting from second element
        for (int i = 1; i < nums.length; i++) {
            // Either start new subarray from current element,
            // or continue the previous subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update maxSum if currentSum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum; // This is the maximum subarray sum
    }
}
