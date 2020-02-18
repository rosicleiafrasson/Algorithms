package datastructures.binarytrees.challenges;
/*
Given the root node of a binary search tree, return the sum of values of all nodes with value between L and R (inclusive).
The binary search tree is guaranteed to have unique values.
 */

import datastructures.binarytrees.Node;

public class RangeSum {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public int rangeSum(TreeNode root, int L, int R){
        int sum = 0;
        if(root != null) {
            if (root.val >= L && root.val <= R) {
                sum = root.val;
            }
            sum += rangeSum(root.left, L, R);
            sum += rangeSum(root.right, L, R);
        }
        return sum;
    }
}
