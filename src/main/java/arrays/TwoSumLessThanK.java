/*
    URL Problem: https://leetcode.com/problems/two-sum-less-than-k/
 */
package arrays;

import java.util.Arrays;

/**
 *
 * @author Carlos
 */
public class TwoSumLessThanK {

    public int twoSumLessThanK(int[] A, int K) {
        int res = -1;
        if (A.length < 1 || A.length > 100 || K < 1 || K > 2000) {
            return -1;
        }
        Arrays.sort(A);
        int l = 0;
        int r = A.length - 1;
        while (l < r) {
            if (A[l] < 1 || A[l] > 200 || A[r] < 1 || A[r] > 200) {
                return -1;
            }
            int sum = A[l] + A[r];
            if (sum < K) {
                res = Math.max(res, sum);
                l++;
            } else {
                r--;
            }
        }
        return res;
    }
}
