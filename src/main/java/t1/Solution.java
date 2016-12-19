package t1;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class Solution {
    public int[] twoSum(int[] nums, int target) {
        return fastVersion(nums, target);
    }

    public int[] slowVersion(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        return null;
    }

    private int[] fastVersion(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            Integer index = map.get(target - nums[i]);
            if (index != null && index.intValue() != i) {
                return new int[]{i, index};
            }
        }

        return null;
    }
}
