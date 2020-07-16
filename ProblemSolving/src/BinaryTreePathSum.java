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
		
		public class BinaryTreePathSum{
			int val;
			TreeNode left; 
			TreeNode right; 
			this.val=val; 
			this.left=left;
			this.right=right;
			
	    public boolean BinaryTreePathSum(TreeNode root, int sum) {
	        
	    if (root == null)
	      return false;

	    sum -= root.val;
	    if ((root.left == null) && (root.right == null))
	      return (sum == 0);
	    return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);
	  }
	}
	    

