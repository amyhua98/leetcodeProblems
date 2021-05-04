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
     public boolean hasPathSum(TreeNode root, int sum) {
        return search(root, 0, sum);
    }
    
    public boolean search(TreeNode node, int pathSum, int sum) {
        if(node == null) return false;
        
        if(node.left == null && node.right == null) {
            pathSum += node.val;
            if(sum == pathSum) return true;
            return false;
        }
        
        return search(node.left, pathSum+node.val, sum) || search(node.right, pathSum+node.val, sum);
    }
}

