package t242;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidAnagramTest {

    private Solution solution = new Solution();

    @Test
    public void should_be_valid_for_correct_anagram() {
        boolean isValid = solution.isAnagram("anagram", "nagaram");

        assertTrue(isValid);
    }

    @Test
    public void should_be_invalid_for_incorrect_anagram() {
        boolean isValid = solution.isAnagram("rat", "cat");

        assertFalse(isValid);
    }
}
