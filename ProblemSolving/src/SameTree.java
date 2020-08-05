

/**
	 * Definition for a binary tree node.
	 * public class TreeNode {
	 *     int val;
	 *     TreeNode left;
	 *     TreeNode right;
	 *     TreeNode(int x) { val = x; }
	 * }
	 */
	public class SameTree {
	    
	  public boolean isSameTree(TreeNode p, TreeNode q) {
	    // p and q are both null
	     if (p == null && q == null) return true;
	    
	      // either one of p and q is null
	     if (q == null || p == null) 
	     {
	         return false;
	     }
	    if (p.val != q.val) 
	    {
	        return false;
	    }
	    
	      //both are same tree when condition is true
	      return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
	  }

	}

