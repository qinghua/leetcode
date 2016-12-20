package t78;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/subsets/
 */
public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        getSubsets(result, new ArrayList<Integer>(), nums, 0);
        return result;
    }

    private void getSubsets(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            getSubsets(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}
