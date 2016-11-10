package t224;

import java.util.Stack;

public class Solution {

    public int calculate(String s) {
        Stack<Expression> expressions = new Stack<Expression>();
        expressions.push(new Expression(0, 0, true));

        for (char ch : s.replace(" ", "").toCharArray()) {
            if (ch == '(') {
                expressions.push(new Expression(0, 0, true));
            } else if (ch == ')') {
                int result = calculateExpression(expressions.pop());
                expressions.lastElement().setParam(result);
            } else if (ch == '+') {
                expressions.lastElement().setSum(calculateExpression(expressions.peek()));
                expressions.lastElement().setPlus(true);
                expressions.lastElement().setParam(0);
            } else if (ch == '-') {
                expressions.lastElement().setSum(calculateExpression(expressions.peek()));
                expressions.lastElement().setPlus(false);
                expressions.lastElement().setParam(0);
            } else {
                expressions.lastElement().appendParam(ch - '0');
            }
        }

        return calculateExpression(expressions.peek());
    }

    private int calculateExpression(Expression expression) {
        return expression.isPlus() ? expression.getSum() + expression.getParam() : expression.getSum() - expression.getParam();
    }

    private class Expression {
        private int sum;
        private int param;
        private boolean isPlus;

        public Expression(int sum, int param, boolean isPlus) {
            this.sum = sum;
            this.param = param;
            this.isPlus = isPlus;
        }

        public int getSum() {
            return sum;
        }

        public void setSum(int sum) {
            this.sum = sum;
        }

        public int getParam() {
            return param;
        }

        public void setParam(int param) {
            this.param = param;
        }

        public boolean isPlus() {
            return isPlus;
        }

        public void setPlus(boolean plus) {
            isPlus = plus;
        }

        public void appendParam(int param) {
            this.param = getParam() == 0 ? param : getParam() * 10 + param;
        }
    }
}
