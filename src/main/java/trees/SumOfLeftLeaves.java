package trees;

import common.TreeNode;

/**
 * LeetCode 404. Sum of Left Leaves — https://leetcode.com/problems/sum-of-left-leaves/
 *
 * <p>Recorrido recursivo: si el hijo izquierdo es una hoja se suma su valor;
 * si no, se sigue bajando por ambos lados.
 *
 * <p>Complejidad: O(n) tiempo, O(h) espacio por la pila de recursión (h = altura del árbol).
 */
public class SumOfLeftLeaves {

    public int sumOfLeftLeaves(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftSum = isLeaf(node.left) ? node.left.val : sumOfLeftLeaves(node.left);
        return leftSum + sumOfLeftLeaves(node.right);
    }

    private static boolean isLeaf(TreeNode node) {
        return node != null && node.left == null && node.right == null;
    }
}
