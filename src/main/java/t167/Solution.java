package t167;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int frontIndex = 0;
        int backIndex = numbers.length - 1;
        do {
            if (numbers[frontIndex] + numbers[backIndex] > target) {
                backIndex--;
            } else if (numbers[frontIndex] + numbers[backIndex] < target) {
                frontIndex++;
            } else {
                return new int[]{frontIndex + 1, backIndex + 1};
            }
        } while (true);
    }
}
