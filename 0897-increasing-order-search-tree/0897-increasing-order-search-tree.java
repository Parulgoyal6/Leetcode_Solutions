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

class Solution {
      private TreeNode current;
    
    public TreeNode increasingBST(TreeNode root) {
    TreeNode dumpyNode = new TreeNode(0);
    current = dumpyNode;
        inOrderTraversal(root);
        return dumpyNode.right;
    
    }
    private void inOrderTraversal(TreeNode node){
        if(node==null){
            return;
        }
        inOrderTraversal(node.left);
        
        node.left = null;
        current.right = node;
        current = node;
        
        inOrderTraversal(node.right);
    }
}