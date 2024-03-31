package LeetCode;

public class MaxDepth {

    public int depth(TreeNode node) {
        if(node != null) {
            int ldepth = depth(node.left);
            int rdepth = depth(node.right);

            if (ldepth > rdepth) {
                return (ldepth + 1);
            }
            else return (rdepth +1);
        }
        return 0;
    }
    public int maxDepth(TreeNode root) {
        return depth(root);
    }

    public static void main(String[] args) {

    }
}
