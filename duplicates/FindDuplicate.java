class Solution {
    public int findDuplicate(int[] nums) {
        HashSet seen = new HashSet();
        
        for (int i = 0; i < nums.length; i++) {
            if (seen.contains(nums[i])) {
                return nums[i];
            } else {
                seen.add(nums[i]);
            }
        }
        
        return -1;
    }
}