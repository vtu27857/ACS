// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public int maxDepth(TreeNode root) {
        // Base case: if the node is null, the depth is 0
        if (root == null) {
            // Highlight: Returns 0 for empty nodes
            return 0; 
        }
        
        // Recursively find the depth of the left and right subtrees
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        
        // Take the larger depth and add 1 for the current node
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
