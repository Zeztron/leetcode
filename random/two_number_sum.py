def twoNumberSum(array, targetSum):

  for i, nums in enumerate(array):
    complement = targetSum - nums
    if complement in array[i+1:]:
      print(array[i], complement)
    
  return []
  
  
		
  
twoNumberSum([-21, 301, 12, 4, 65, 56, 210, 356, 9, -47], 164)