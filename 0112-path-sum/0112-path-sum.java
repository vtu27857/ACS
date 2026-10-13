
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        // Base case: if the node is null, no path exists
        if (root == null) {
            return false;
        }
        
        // Subtract the current node's value from the remaining target sum
        targetSum -= root.val;
        
        // If it's a leaf node, check if the remaining sum is zero
        if (root.left == null && root.right == null) {
            return targetSum == 0;
        }
        
        // Recursively check the left and right subtrees
        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}
