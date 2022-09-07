package 力扣刷题;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;

    }
}

public class MaxTree {
    public TreeNode insertIntoMaxTree(TreeNode root, int val) {
        if (root.val < val) return new TreeNode(val, root, null);
        if (root.right == null) {
            root.right = new TreeNode(val);
            return root;
        }
        root.right = insertIntoMaxTree(root.right, val);
        return root;
    }

}
