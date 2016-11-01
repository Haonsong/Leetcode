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

    private boolean Validing(TreeNode node, TreeNode min, TreeNode max){
        if (node == null) return true;
        boolean left = true;
        boolean right = true;

        if(node.left != null && min != null ){
            left = node.left.val < node.val && node.left.val > min.val;
        }

        if(node.right != null && max != null ){
            right = node.right.val > node.val && node.right.val < max.val;
        }

        if(min == null) left = node.left == null || node.left.val < node.val;

        else if(max == null) right = node.right== null || node.right.val > node.val;

        return left && right && Validing(node.left,min,node ) && Validing(node.right,node,max);
    }




    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        boolean left = true;
        boolean right = true;


        if (root.left != null) {
            left = root.left.val < root.val;
        }
        if (root.right != null) {
            right = root.right.val > root.val;
        }
        return left && right && Validing(root.left,null,root ) && Validing(root.right,root,null);
    }
}


/* Hard to test

Test cases are
[2,1,3]
[10,1,12,null,null,6,15]
[1,1,1,1,1,1,1]
[2,2,3]
[]
[3,1,5,0,2,4,6]
[6,5,7,4,null,null,null,5]
[3,2,null,1,-2147483648]
 *
 */

/*

    private boolean Validing_right(TreeNode node, int min, int max){
        if (node == null) return true;
        boolean left = true;
        boolean right = true;
        if (node.left != null) {
            left = min< node.left.val;
            right &= node.left.val<max;
        }
        if (node.right != null) {
            right = node.right.val > max;
        }
        return left && right && Validing_left(node.left,node.left.val,node.val ) && Validing_right(node.right, node.val,node.right.val);
    }
 */