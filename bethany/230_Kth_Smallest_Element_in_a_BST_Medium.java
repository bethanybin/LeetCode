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
    public int kthSmallest(TreeNode root, int k) {
        TreeNode smallest;
        //int toReturn = 0;
        int i = 1;
        TreeNode curr = root;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while(curr.left != null){
            stack.push(curr.left);
            curr = curr.left;
        }
        curr = stack.pop();
        while(i < k){
            if(curr.right != null){
                curr = curr.right;
                while(curr.left != null){
                    stack.push(curr);
                    curr = curr.left;
                }
            }
            else{
                curr = stack.pop();
            }
            i++;
        }
        return curr.val;
    }
}

//Results:
//Runtime: 1 ms, faster than 41.69% of Java online submissions for Kth Smallest Element in a BST.
//Memory Usage: 39.1 MB, less than 13.14% of Java online submissions for Kth Smallest Element in a BST.
