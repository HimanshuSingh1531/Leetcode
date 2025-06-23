class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1, max = 0;

        while (i < j) {
            int h = (height[i] < height[j]) ? height[i++] : height[j--];
            max = Math.max(max, (j - i + 1) * h);
        }

        return max;
    }
}
