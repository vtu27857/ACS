import java.util.ArrayList;
import java.util.List;

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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if (root != null) {
            dfs(root, "", result);
        }
        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {
        // Append the current node's value to the path
        path += node.val;

        // If it's a leaf node, add the completed path to the results
        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        // If not a leaf, continue down the tree with "->" appended
        if (node.left != null) {
            dfs(node.left, path + "->", result);
        }
        if (node.right != null) {
            dfs(node.right, path + "->", result);
        }
    }
}
