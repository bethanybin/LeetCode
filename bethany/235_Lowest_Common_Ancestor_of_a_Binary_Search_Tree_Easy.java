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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode curr = root;
        stack.push(curr);
        int pVal = p.val;
        int qVal = q.val;
        while(!stack.isEmpty()){
            curr = stack.pop();
            int currVal = curr.val;
            if(pVal <= currVal && qVal >= currVal || qVal <= currVal && pVal >= currVal){
                break;
            }
            else if(pVal > currVal && qVal > currVal){
                if(curr.right != null){
                    stack.push(curr.right);
                }
            }
            else if(pVal < currVal && qVal < currVal){
                if(curr.left != null){
                    stack.push(curr.left);
                }
            }
        }
        
        return curr;
    }
}

//Results:
//Runtime: 4 ms, faster than 100.00% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.
//Memory Usage: 35.1 MB, less than 39.07% of Java online submissions for Lowest Common Ancestor of a Binary Search Tree.

