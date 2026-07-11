package trees;

import common.TreeNode;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class SumOfLeftLeavesTest {

    @Test
    public void testSumOfLeftLeaves() {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

        // Construcción del árbol de prueba
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        // Verificación del resultado esperado
        int expectedSum = 9 + 15;  // Suma de las hojas izquierdas
        assertEquals(expectedSum, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void testSingleNode() {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

        // Árbol con solo la raíz
        TreeNode root = new TreeNode(1);

        // No hay hojas izquierdas, el resultado debe ser 0
        assertEquals(0, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }

    @Test
    public void testOnlyLeftLeaves() {
        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();

        // Construcción del árbol
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(2);

        // Hojas izquierdas: 1 (la única hoja izquierda)
        assertEquals(2, sumOfLeftLeaves.sumOfLeftLeaves(root));
    }
}
