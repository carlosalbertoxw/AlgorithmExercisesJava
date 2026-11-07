package twopointers;

import java.util.Arrays;

/**
 * LeetCode 1099. Two Sum Less Than K — https://leetcode.com/problems/two-sum-less-than-k/
 *
 * <p>Ordena una copia del arreglo y recorre con dos punteros desde los extremos.
 *
 * <p>Complejidad: O(n log n) tiempo (por el ordenamiento), O(n) espacio (la copia).
 */
public class TwoSumLessThanK {

    /**
     * Devuelve la suma máxima de dos elementos distintos que sea menor que {@code k},
     * o -1 si no existe tal par. No modifica el arreglo de entrada.
     */
    public int twoSumLessThanK(int[] nums, int k) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        int best = -1;
        int left = 0;
        int right = sorted.length - 1;
        while (left < right) {
            int sum = sorted[left] + sorted[right];
            if (sum < k) {
                best = Math.max(best, sum);
                left++;
            } else {
                right--;
            }
        }
        return best;
    }
}
