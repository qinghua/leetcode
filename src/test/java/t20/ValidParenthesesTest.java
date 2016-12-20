package t20;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidParenthesesTest {

    private Solution solution = new Solution();

    @Test
    public void should_be_valid_for_correct_close() {
        boolean isValid = solution.isValid("()[]{}");

        assertTrue(isValid);
    }

    @Test
    public void should_be_invalid_for_incorrect_close() {
        boolean isValid = solution.isValid("([)]");

        assertFalse(isValid);
    }

    @Test
    public void should_be_invalid_for_additional_close_parenthese() {
        boolean isValid = solution.isValid("]");

        assertFalse(isValid);
    }

    @Test
    public void should_be_invalid_for_additional_open_parenthese() {
        boolean isValid = solution.isValid("[");

        assertFalse(isValid);
    }
}
