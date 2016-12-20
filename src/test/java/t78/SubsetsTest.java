package t78;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SubsetsTest {

    private Solution solution = new Solution();

    @Test
    public void should_get_1_and_2() {
        int[] numbers = {1, 2, 3};
        List<List<Integer>> result = solution.subsets(numbers);

        assertEquals(8, result.size());
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(1); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(2); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(3); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(1);add(2); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(1);add(3); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(2);add(3); }}));
        assertTrue(result.contains(new ArrayList<Integer>(){{ add(1);add(2);add(3); }}));
        assertTrue(result.contains(new ArrayList<Integer>()));
    }
}
