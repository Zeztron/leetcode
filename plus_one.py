class Solution:
    def plusOne(self, digits):
      print(digits)

      # convert list of integers into a number
      # add one to that number
      # insert that number into an array
      digit_str = [str(i) for i in digits]
  
      digit_num = int("".join(digit_str))
      
      digit_num += 1

      plus_one = [int(i) for i in str(digit_num)]
  
      return plus_one


solution = Solution()
solution.plusOne([4,3,2,1])