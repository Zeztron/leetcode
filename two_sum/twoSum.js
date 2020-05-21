/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
  const numMap = new Map();
  
  for (i in nums) {
      if (numMap.has(target - nums[i])) {
          return [i, numMap.get(target - nums[i])];
      };
      
      numMap.set(nums[i], i);
  }
};