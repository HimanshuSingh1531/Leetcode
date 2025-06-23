public class Solution {

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int width = right - left;
            int ht = Math.min(height[left], height[right]);
            int area = width * ht;
            maxArea = Math.max(maxArea, area);

            // Move the shorter line
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxArea;
    }

    // Main method to run the program
    public static void main(String[] args) {
        Solution obj = new Solution();

        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = obj.maxArea(height);

        System.out.println("Maximum area: " + result);
    }
}
