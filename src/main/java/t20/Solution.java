package t20;

import java.util.Stack;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && (stack.empty() || stack.pop() != '(')) {
                return false;
            } else if (c == ']' && (stack.empty() || stack.pop() != '[')) {
                return false;
            } else if (c == '}' && (stack.empty() || stack.pop() != '{')) {
                return false;
            }
        }

        return stack.empty();
    }
}
