package twopointers;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class TwoSumLessThanKTest {

    private final TwoSumLessThanK solution = new TwoSumLessThanK();

    static Stream<Arguments> cases() {
        return Stream.of(
                Arguments.of(new int[] {34, 23, 1, 24, 75, 33, 54, 8}, 60, 58), // 34 + 24
                Arguments.of(new int[] {10, 20, 30, 40}, 50, 40),              // 10 + 30
                Arguments.of(new int[] {1, 2, 3, 4, 5}, 7, 6),                  // 1 + 5 o 2 + 4
                Arguments.of(new int[] {10, 20, 30}, 5, -1),                    // ningún par suma menos de 5
                Arguments.of(new int[] {-1, 0, 2, 5, 8}, 7, 5),                 // 0 + 5 (con negativos)
                Arguments.of(new int[] {5}, 10, -1),                            // un solo elemento
                Arguments.of(new int[] {}, 10, -1));                            // arreglo vacío
    }

    @ParameterizedTest
    @MethodSource("cases")
    void returnsMaxSumBelowK(int[] nums, int k, int expected) {
        assertEquals(expected, solution.twoSumLessThanK(nums, k));
    }

    @Test
    void doesNotModifyInput() {
        int[] nums = {34, 23, 1, 24};

        solution.twoSumLessThanK(nums, 60);

        assertArrayEquals(new int[] {34, 23, 1, 24}, nums);
    }
}
