class Solution {
  public boolean containsDuplicate(int[] nums) {
    HashSet seen = new HashSet();

    for (int i = 0; i < nums.length; i++) {
      if (seen.contains(nums[i])) {
        return true;
      } else {
        seen.add(nums[i]);
      }
    }

    return false;
  }
}