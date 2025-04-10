class Solution {
    // Time: O(n)
    // Space: O(n)
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            // cur + x = target
            // x = target - cur
            int x = target - cur;
            if (map.containsKey(x)) {
                return new int[] { map.get(x), i };
            }
            map.put(cur, i);
        }
        return null;
    }
}
