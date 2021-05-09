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
    public TreeNode sortedArrayToBST(int[] nums) {
        return createBST(nums, 0, nums.length-1);
    }
    
    private TreeNode createBST(int[] nums, int left, int right) {
        if(right < left) {
            return null;
        }
        int mid = (right + left)/2;
        TreeNode leftTree = createBST(nums, left, mid-1);
        TreeNode rightTree = createBST(nums, mid+1, right);
        TreeNode node = new TreeNode(nums[mid], leftTree, rightTree);
        return node;
    }
}