// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Three line explanation of solution in plain english: Made use of inorder traversal. added all the values in arraylist and then checked if i<i+1. if no at any point then returned false

import java.util.ArrayList;

class Solution {
    ArrayList<Integer> fill = new ArrayList<Integer>();

    public boolean isValidBST(TreeNode root) {

        if (root == null) {
            return true;
        }

        traverseInOrder(root);

        for (int j = 1; j < fill.size(); j++) {
            if (!(fill.get(j - 1) < fill.get(j))) {
                return false;
            }
        }

        return true;

    }

    public void traverseInOrder(TreeNode root) {

        if (root.left != null) {
            traverseInOrder(root.left);
        }

        fill.add(root.val);

        if (root.right != null) {
            traverseInOrder(root.right);
        }

    }

}