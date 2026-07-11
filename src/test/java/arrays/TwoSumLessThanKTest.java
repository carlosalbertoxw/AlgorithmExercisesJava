package arrays;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Carlos
 */
public class TwoSumLessThanKTest {

    @Test
    public void testTwoSumLessThanK() {
        TwoSumLessThanK twoSumLessThanK = new TwoSumLessThanK();

        // Caso 1: Array con números positivos
        int[] nums1 = {10, 20, 30, 40};
        int k1 = 50;
        assertEquals(40, twoSumLessThanK.twoSumLessThanK(nums1, k1));

        // Caso 2: Array con números pequeños
        int[] nums2 = {1, 2, 3, 4, 5};
        int k2 = 7;
        assertEquals(6, twoSumLessThanK.twoSumLessThanK(nums2, k2));

        // Caso 3: No hay pares que sumen menos que K
        int[] nums3 = {10, 20, 30};
        int k3 = 5;
        assertEquals(-1, twoSumLessThanK.twoSumLessThanK(nums3, k3));

        // Caso 4: Números negativos y positivos
        int[] nums4 = {-1, 0, 2, 5, 8};
        int k4 = 7;
        assertEquals(-1, twoSumLessThanK.twoSumLessThanK(nums4, k4));
    }
}
