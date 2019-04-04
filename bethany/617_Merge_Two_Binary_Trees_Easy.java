/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        int val1 = 0;
        int val2 = 0;
        if(t1 == null){
            return t2;
        }
        else{
            val1 = t1.val;
        }
        if(t2 == null){
            return t1;
        }
        else{
            val2 = t2.val;
        }
        TreeNode currNode = new TreeNode(val1 + val2);
        currNode.left = mergeTrees(t1.left, t2.left);
        currNode.right = mergeTrees(t1.right, t2.right);
        return currNode;
    }
}

//Results:
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Merge Two Binary Trees.
//Memory Usage: 40.6 MB, less than 87.83% of Java online submissions for Merge Two Binary Trees.
