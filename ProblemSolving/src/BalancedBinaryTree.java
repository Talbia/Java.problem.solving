import javax.swing.tree.TreeNode;

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
class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
           
        if (root == null) return true;
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        
        if (Math.abs(leftDepth - rightDepth) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public int depth(TreeNode root) {
        if (root == null) return 0;
        return 1 + Math.max(depth(root.left), depth(root.right));
    }
        
    }







