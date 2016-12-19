package t98;

import org.junit.Test;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidateBinarySearchTreeTest {

    private Solution solution = new Solution();

    @Test
    public void should_return_true_for_a_normal_bst() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode2.left = treeNode1;
        treeNode2.right = treeNode3;

        boolean isValid = solution.isValidBST(treeNode2);

        assertTrue(isValid);
    }

    @Test
    public void should_return_false_for_none_bst() {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        boolean isValid = solution.isValidBST(treeNode1);

        assertFalse(isValid);
    }

    @Test
    public void should_return_false_for_grand_son_too_small() {
        TreeNode treeNode1 = new TreeNode(10);
        TreeNode treeNode2 = new TreeNode(5);
        TreeNode treeNode3 = new TreeNode(15);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        TreeNode treeNode4 = new TreeNode(6);
        TreeNode treeNode5 = new TreeNode(20);
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        boolean isValid = solution.isValidBST(treeNode1);

        assertFalse(isValid);
    }
}
