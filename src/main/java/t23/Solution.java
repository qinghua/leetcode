package t23;

/**
 * https://leetcode.com/problems/merge-k-sorted-lists/
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        if (lists.length == 1) return lists[0];

        ListNode[] nextLists = new ListNode[(lists.length + 1) / 2];
        int pointer = 0;
        for (int i = 0; i < lists.length; i = i + 2) {
            if (lists.length > i + 1) {
                nextLists[pointer++] = merge2ListNodes(lists[i], lists[i + 1]);
            } else {
                nextLists[pointer] = lists[i];
            }
        }
        return mergeKLists(nextLists);
    }

    private ListNode merge2ListNodes(ListNode node1, ListNode node2) {
        if (node1 == null) return node2;
        if (node2 == null) return node1;

        ListNode resultNode = new ListNode(0);
        ListNode result = resultNode;

        while (true) {
            if (node1.val < node2.val) {
                if (node1.next == null) {
                    resultNode.next = node1;
                    resultNode.next.next = node2;
                    break;
                }

                ListNode tempNode = node1.next;
                resultNode.next = node1;
                node1 = tempNode;
                resultNode = resultNode.next;
            } else {
                if (node2.next == null) {
                    resultNode.next = node2;
                    resultNode.next.next = node1;
                    break;
                }

                ListNode tempNode = node2.next;
                resultNode.next = node2;
                node2 = tempNode;
                resultNode = resultNode.next;
            }
        }

        return result.next;
    }
}
