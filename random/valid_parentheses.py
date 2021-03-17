class Solution:
    def isValid(self, s: str) -> bool:
        
        stack = []
        open_list = ["[", "{", "("]
        closed = ["]", "}", ")"]

        for char in s:
            if char in open_list:
                stack.append(char)
            elif char in closed:
                pos = closed.index(char)
                if ((len(stack) > 0) and (open_list[pos] == stack[len(stack)-1])):
                    stack.pop()
                else:
                    return False

        if len(stack) == 0:
            return True

        return False
        