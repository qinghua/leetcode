package t1;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumTest {

    private Solution solution = new Solution();

    @Test
    public void should_get_0_and_1() {
        int[] numbers = {2, 7, 11, 15};
        int[] ints = solution.twoSum(numbers, 9);

        assertEquals(0, ints[0]);
        assertEquals(1, ints[1]);
    }

    @Test
    public void should_get_1_and_2() {
        int[] numbers = {3, 2, 4, 1};
        int[] ints = solution.twoSum(numbers, 6);

        assertEquals(1, ints[0]);
        assertEquals(2, ints[1]);
    }
}
