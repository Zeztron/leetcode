/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
  public List<Integer> inorderTraversal(TreeNode root) {
      
      List<Integer> numbers = new ArrayList<Integer>();
      traverse(root, numbers);
      return numbers;
  
  }
  
  public void traverse(TreeNode root, List<Integer> numbers) {
      
      if (root == null) return;
      
      traverse(root.left, numbers);
      numbers.add(root.val);
      traverse(root.right, numbers);
      
  }
}