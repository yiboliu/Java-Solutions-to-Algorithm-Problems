/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root.equals(p) || root.equals(q)) return root;
        TreeNode temp = root;
        if(temp.val <= p.val && p.val < q.val){
        	while(!(p.val <= temp.val && temp.val <= q.val)){
        		if(temp.val < p.val) temp = temp.right;
        		else temp = temp.left;
        	}
        }
        else if(temp.val <= q.val && q.val < p.val){
        	while(!(q.val <= temp.val && temp.val <= p.val)){
        		if(temp.val < q.val) temp = temp.right;
        		else temp = temp.left;
        	}
        }
        else if (p.val < q.val && q.val <= temp.val){
        	while(!(p.val <= temp.val && temp.val <= q.val)){
        		if(temp.val > q.val) temp = temp.left;
        		else temp = temp.right;
        	}
        }
        else if (q.val < p.val && p.val <= temp.val){
        	while(!(q.val <= temp.val && temp.val <= p.val)){
        		if(temp.val > p.val) temp = temp.left;
        		else temp = temp.right;
        	}
        }
        return temp;
    }
}
