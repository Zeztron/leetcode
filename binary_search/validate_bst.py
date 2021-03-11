# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: TreeNode) -> bool:
        
        return self.helper(root, float("-inf"), float("inf"))
    
    def helper(self, tree, min_val, max_val):
        
        if tree is None:
            return True
        
  
        if tree.val <= min_val or tree.val >= max_val:
            return False

        return self.helper(tree.left, min_val, tree.val) and self.helper(tree.right, tree.val, max_val)