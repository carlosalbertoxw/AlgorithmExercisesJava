package trees;

import static org.junit.jupiter.api.Assertions.assertEquals;

import common.TreeNode;
import org.junit.jupiter.api.Test;

class SumOfLeftLeavesTest {

    private final SumOfLeftLeaves solution = new SumOfLeftLeaves();

    @Test
    void sumsLeftLeavesAtDifferentLevels() {
        //     3
        //    / \
        //   9   20
        //      /  \
        //     15   7
        TreeNode root = new TreeNode(3,
                new TreeNode(9),
                new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        assertEquals(9 + 15, solution.sumOfLeftLeaves(root));
    }

    @Test
    void returnsZeroForSingleNode() {
        // La raíz sola no cuenta como hoja izquierda.
        assertEquals(0, solution.sumOfLeftLeaves(new TreeNode(1)));
    }

    @Test
    void returnsZeroForEmptyTree() {
        assertEquals(0, solution.sumOfLeftLeaves(null));
    }

    @Test
    void handlesLeftOnlyChain() {
        // 10 -> 5 -> 3 -> 2 (todos a la izquierda): la única hoja izquierda es 2.
        TreeNode root = new TreeNode(10,
                new TreeNode(5, new TreeNode(3, new TreeNode(2), null), null),
                null);

        assertEquals(2, solution.sumOfLeftLeaves(root));
    }

    @Test
    void ignoresRightLeaves() {
        // 1 -> 2 (derecha): 2 es hoja pero no izquierda.
        assertEquals(0, solution.sumOfLeftLeaves(new TreeNode(1, null, new TreeNode(2))));
    }
}
