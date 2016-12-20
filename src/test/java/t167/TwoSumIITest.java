package t167;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TwoSumIITest {

    private Solution solution = new Solution();

    @Test
    public void should_get_1_and_2() {
        int[] numbers = {2, 7, 11, 15};
        int[] ints = solution.twoSum(numbers, 9);

        assertEquals(1, ints[0]);
        assertEquals(2, ints[1]);
    }

    @Test
    public void should_get_2_and_4() {
        int[] numbers = {1, 2, 3, 4};
        int[] ints = solution.twoSum(numbers, 6);

        assertEquals(2, ints[0]);
        assertEquals(4, ints[1]);
    }
}
