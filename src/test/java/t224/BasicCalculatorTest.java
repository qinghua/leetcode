package t224;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BasicCalculatorTest {

    private Solution solution = new Solution();

    @Test
    public void should_get_2_for_1_plus_1() {
        assertEquals(2, solution.calculate("1 + 1"));
    }

    @Test
    public void should_get_3_for_2_minus_1_plus_2() {
        assertEquals(3, solution.calculate(" 2-1 + 2 "));
    }

    @Test
    public void should_be_able_to_handle_bracket() {
        assertEquals(23, solution.calculate("(1+(4+5+2)-3)+(6+8)"));
    }

    @Test
    public void should_get_0_for_0() {
        assertEquals(0, solution.calculate("0"));
    }

    @Test
    public void should_get_1_for_bracket_1() {
        assertEquals(1, solution.calculate("(1)"));
    }

    @Test
    public void should_get_minus4_for_1_minus_bracket_5() {
        assertEquals(-4, solution.calculate("1-(5)"));
    }

    @Test
    public void should_get_1_for_4_minus_5_add_2() {
        assertEquals(1, solution.calculate("4-5+2"));
    }

    @Test
    public void should_be_able_to_handle_double_minus() {
        assertEquals(3, solution.calculate("2-(5-6)"));
    }

    @Test
    public void should_be_able_to_handle_outside_bracket_with_inner_minus() {
        assertEquals(-1, solution.calculate("(5-(1+(5)))"));
    }

    @Test
    public void should_be_able_to_handle_expression_starts_with_minus() {
        assertEquals(-2, solution.calculate("(6)-(8)-(7)+(1+(6))"));
    }

    @Test
    public void should_be_able_to_handle_a_long_string() {
        assertEquals(-35, solution.calculate("5+3-4-(1+2-7+(10-1+3+5+(3-0+(8-(3+(8-(10-(6-10-8-7+(0+0+7)-10+5-3-2+(9+0+(7+(2-(2-(9)-2+5+4+2+(2+9+1+5+5-8-9-2-9+1+0)-(5-(9)-(0-(7+9)+(10+(6-4+6))+0-2+(10+7+(8+(7-(8-(3)+(2)+(10-6+10-(2)-7-(2)+(3+(8))+(1-3-8)+6-(4+1)+(6))+6-(1)-(10+(4)+(8)+(5+(0))+(3-(6))-(9)-(4)+(2))))))-1)))+(9+6)+(0))))+3-(1))+(7))))))))"));
    }
}
