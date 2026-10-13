class Solution {
    private int count = 0;
    private int result = 0;

    public int kthSmallest(TreeNode root, int k) {
        count = k;
        inOrder(root);
        return result;
    }

    private void inOrder(TreeNode node) {
        if (node == null || count == 0) return;

        inOrder(node.left);

        count--;
        if (count == 0) {
            result = node.val;
            return;
        }

        inOrder(node.right);
    }
}
