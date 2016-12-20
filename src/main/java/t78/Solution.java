package t78;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            result.addAll(addSubsets(i, nums));
        }

        return result;
    }

    private List<List<Integer>> addSubsets(int level, final int[] nums) {
        ArrayList<List<Integer>> result = new ArrayList<>();

        if (level == 0) {
            result.add(new ArrayList<Integer>());
            return result;
        } else if (level == 1) {
            for (final int num : nums) {
                result.add(new ArrayList<Integer>(){{add(num);}});
            }
            return result;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums.length - 1 - i == 0) break;

            int[] nextNums = new int[nums.length - 1 - i];
            System.arraycopy(nums, i + 1, nextNums, 0, nextNums.length);
            List<List<Integer>> subsets = addSubsets(level - 1, nextNums);
            for (List<Integer> list : subsets) {
                list.add(0, nums[i]);
            }
            result.addAll(subsets);
        }

        return result;
    }
}
