package t98;

/**
 * https://leetcode.com/problems/validate-binary-search-tree/
 *
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        if (root.left != null && root.left.val >= root.val) return false;
        if (root.right != null && root.right.val <= root.val) return false;

        boolean isBst = isValidBST(root.left)
                && isValidBST(root.right);
        if (root.left != null) isBst = isBst && (getMax(root.left) < root.val);
        if (root.right != null) isBst = isBst && (getMin(root.right) > root.val);

        return isBst;
    }

    public int getMax(TreeNode node) {
        return node.right == null ? node.val : getMax(node.right);
    }

    public int getMin(TreeNode node) {
        return node.left == null ? node.val : getMin(node.left);
    }
}
