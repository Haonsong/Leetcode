/**
 * Created by SHN on 10/30/16.
 */
public class Solution_98 {
    //Definition for a binary tree node.
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;

        boolean left = false;
        boolean right = false;

        if (root.left != null && root.left.val < root.val) {
            left = true;
        }
        if (root.right != null && root.right.val > root.val) {
            right = true;
        }
        return left && right && isValidBST(root.left) && isValidBST(root.right);
    }
}
