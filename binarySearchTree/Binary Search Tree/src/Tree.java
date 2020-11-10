public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverse() {
        if (root != null) {
            root.traversalInOrder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }

        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    int count = 1;

    private TreeNode delete(TreeNode subTreeNode, int value) {
        System.out.println("Call " + count++ + ": " + subTreeNode.getData() + " " + value);
        if (value < subTreeNode.getData()) {
            subTreeNode.setLeftChild(delete(subTreeNode.getLeftChild(), value));
            System.out.println(subTreeNode.getLeftChild());
        } else if (value > subTreeNode.getData()) {
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), value));
            System.out.println(subTreeNode.getRightChild());
        } else {
            if (subTreeNode.getLeftChild() == null) {
                System.out.println(subTreeNode.getLeftChild());
                return subTreeNode.getRightChild();
            } else if (subTreeNode.getRightChild() == null) {
                System.out.println(subTreeNode.getRightChild());
                return subTreeNode.getLeftChild();
            }
            subTreeNode.setData(subTreeNode.getRightChild().min());
            subTreeNode.setRightChild(delete(subTreeNode.getRightChild(), subTreeNode.getData()));
        }
        return subTreeNode;
    }

    public int min() {
        if (root != null) {
            return root.min();
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public int max() {
        if (root != null) {
            return root.max();
        } else {
            return Integer.MAX_VALUE;
        }
    }
}
