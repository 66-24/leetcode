package array;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    @Test
    void testTwoSumFound() {
        var result = TwoSum.twoSum(new int[] {2, 7, 11, 15}, 9);
        assertTrue(result.isPresent());
        var pair = result.get();
        assertEquals(1, pair.first());
        assertEquals(0, pair.second());
    }

    @Test
    void testTwoSumNotFound() {
        var result = TwoSum.twoSum(new int[] {1, 2, 3, 4}, 8);
        assertTrue(result.isEmpty());
    }

    @Test
    void testTwoSumLongerInput() {
        var result = TwoSum.twoSum(new int[] {1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25, 27, 29}, 40);
        assertTrue(result.isPresent());
        var pair = result.get();
        assertTrue((pair.first() == 9 && pair.second() == 10) || (pair.first() == 10 && pair.second() == 9));
    }
}