/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        
        // Iteratively
        LinkedList<Node> stack = new LinkedList<>();
        LinkedList<Integer> output = new LinkedList<>();
        
        if (root == null) return output;
        
        stack.add(root);
        while(!stack.isEmpty()) {
            Node node = stack.pollLast();
            output.addFirst(node.val);
            for (Node child : node.children) {
                stack.add(child);
            }
        }
        
        return output;
        
//         List<Integer> output = new ArrayList<>();
//         traverse(root, output);
        
//         return output;
        
        
    }
    
    // Recursively
//     public void traverse(Node root, List<Integer> output) {
//         if (root == null) return;
        
//         for (Node child : root.children) {
//             traverse(child, output);
//         }
        
//         output.add(root.val);
//     }
}


