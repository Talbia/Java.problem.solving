import javax.swing.tree.TreeNode;

public class SortedArraytoBinarySearchTree {
	
	//Preorder Traversal: Always Choose Left Middle Node as a Root
	
	  int[] nums;

	  public TreeNode traversal(int left, int right) {
	    if (left > right) 
	        return null;

	    // always choose left middle node as a root
	    int p = (left + right) / 2;

	    // preorder traversal: node -> left -> right
	    TreeNode root = new TreeNode(nums[p]);
	    root.left = traversal(left, p - 1);
	    root.right = traversal(p + 1, right);
	    return root;
	  }

	  public TreeNode sortedArrayToBST(int[] nums) {
	    this.nums = nums;
	    return traversal(0, nums.length - 1);
	  }
	

}
