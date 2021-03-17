class Solution:
    def lengthOfLastWord(self, s):


      if s == " ":
        return 0
      
      stripped = s.strip()

      split = stripped.split(" ")

      last_word = split[len(split) - 1]
      print(last_word)
      
      return len(last_word)

solution = Solution()
solution.lengthOfLastWord("a ")
        