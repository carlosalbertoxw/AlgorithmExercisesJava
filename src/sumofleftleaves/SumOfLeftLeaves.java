/*
    URL Problem: https://leetcode.com/problems/sum-of-left-leaves/
 */
package sumofleftleaves;

/**
 *
 * @author Carlos
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode node) {
        int res = 0;

        if (node != null) {
            if (node.left != null && node.left.left == null && node.left.right == null) {
                res += node.left.val;
            } else {
                res += sumOfLeftLeaves(node.left);
            }
            res += sumOfLeftLeaves(node.right);
        }
        return res;
    }
}
