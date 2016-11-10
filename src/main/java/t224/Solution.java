package t224;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public int calculate(String s) {
        return calculateWithBracket(s.replace(" ", ""));
    }

    private int calculateWithBracket(String s) {
        List<Integer> sum = new ArrayList<Integer>();
        List<Integer> param = new ArrayList<Integer>();
        List<Boolean> isPlus = new ArrayList<Boolean>();
        sum.add(0);
        param.add(0);
        isPlus.add(true);
        int layer = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                sum.add(0);
                param.add(0);
                isPlus.add(true);
                layer++;
            } else if (ch == ')') {
                param.set(layer - 1, calc(sum.get(layer), param.get(layer), isPlus.get(layer)));
                sum.remove(layer);
                param.remove(layer);
                isPlus.remove(layer);
                layer--;
            } else if (ch == '+') {
                sum.set(layer, calc(sum.get(layer), param.get(layer), isPlus.get(layer)));
                isPlus.set(layer, true);
                param.set(layer, 0);
            } else if (ch == '-') {
                sum.set(layer, calc(sum.get(layer), param.get(layer), isPlus.get(layer)));
                isPlus.set(layer, false);
                param.set(layer, 0);
            } else {
                if (param.get(layer) == 0) {
                    param.set(layer, ch - '0');
                } else {
                    param.set(layer, param.get(layer) * 10 + ch - '0');
                }
            }
        }

        return calc(sum.get(layer), param.get(layer), isPlus.get(layer));
    }

    private int calc(int sum, int param, boolean isPlus) {
        return isPlus ? sum + param : sum - param;
    }
}

