class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for index,num in  enumerate(nums):
            complement = target - num
            if complement in nums[index+1:]:
                return(index, nums.index(complement))