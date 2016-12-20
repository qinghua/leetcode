package t78;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        return getSubsets(nums, 0);
    }

    private List<List<Integer>> getSubsets(int[] nums, int start) {
        if (start == nums.length) return new ArrayList<List<Integer>>(){{add(new ArrayList<Integer>());}};

        List<List<Integer>> subsets = getSubsets(nums, start + 1);
        List<List<Integer>> result = new ArrayList<>(subsets);
        for (List<Integer> subset : subsets) {
            ArrayList<Integer> tempList = new ArrayList<>(subset);
            tempList.add(0, nums[start]);
            result.add(tempList);
        }
        return result;
    }
}
