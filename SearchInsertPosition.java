class Solution {
    public int searchInsert(int[] nums, int target) {
        int i;
        
        if (nums[nums.length - 1] < target) {
			return nums.length;
        }
        
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (nums[i] > target) {
                return i;
            }
        }
        
        return 0;
    }
}