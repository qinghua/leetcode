package t23;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        lists = filterNull(lists);
        if (lists.length == 0) return null;

        ListNode result = new ListNode(Integer.MIN_VALUE);
        ListNode temp = result;
        do {
            temp.next = min(lists);
            temp = temp.next;
            for (int i = 0; i < lists.length; i++) {
                ListNode node = lists[i];
                if (node.val == temp.val) {
                    if (node.next == null) {
                        ListNode[] newList = new ListNode[lists.length - 1];
                        System.arraycopy(lists, 0, newList, 0, i);
                        System.arraycopy(lists, i + 1, newList, i, lists.length - i - 1);
                        lists = newList;
                    } else {
                        lists[i] = node.next;
                    }
                    break;
                }
            }
        } while (lists.length != 0);

        return result.next;
    }

    private ListNode[] filterNull(ListNode[] lists) {
        List<ListNode> nodes = new ArrayList<>();
        for (ListNode node : lists) {
            if (node != null) nodes.add(node);
        }

        return nodes.toArray(new ListNode[]{});
    }

    private ListNode min(ListNode... nodes) {
        ListNode minNode = new ListNode(Integer.MAX_VALUE);
        for (ListNode node : nodes) {
            if (node.val < minNode.val) minNode = new ListNode(node.val);
        }

        return minNode;
    }
}
