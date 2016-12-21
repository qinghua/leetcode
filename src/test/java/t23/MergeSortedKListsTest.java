package t23;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MergeSortedKListsTest {

    private Solution solution = new Solution();

    @Test
    public void should_return_same_list_for_1_list() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        ListNode result = solution.mergeKLists(new ListNode[]{listNode1});

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
    }

    @Test
    public void should_return_merged_list_for_2_lists() {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode3;
        listNode3.next = listNode5;
        listNode2.next = listNode4;

        ListNode result = solution.mergeKLists(new ListNode[]{listNode1, listNode2});

        assertEquals(1, result.val);
        assertEquals(2, result.next.val);
        assertEquals(3, result.next.next.val);
        assertEquals(4, result.next.next.next.val);
        assertEquals(5, result.next.next.next.next.val);
    }

    @Test
    public void should_return_null_for_empty_lists() {
        ListNode result = solution.mergeKLists(new ListNode[]{});

        assertEquals(null, result);
    }

    @Test
    public void should_return_null_for_null_lists() {
        ListNode result = solution.mergeKLists(new ListNode[]{null});

        assertEquals(null, result);
    }

    @Test
    public void should_return_merged_list_for_lists_with_null() {
        ListNode listNode1 = new ListNode(1);

        ListNode result = solution.mergeKLists(new ListNode[]{null, listNode1});

        assertEquals(1, result.val);
    }
}
