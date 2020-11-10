
public class TreeNode {
    private int data;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public void insert(int value) {
        if (value == data) {
            return;
        } else if (value < data) {
            if (leftChild == null) {
                leftChild = new TreeNode(value);
            } else {
                leftChild.insert(value);
            }
        } else {
            if (rightChild == null) {
                rightChild = new TreeNode(value);
            } else {
                rightChild.insert(value);
            }
        }
    }

    public void traversalInOrder() {
        if (leftChild != null) {
            leftChild.traversalInOrder();
        }
        else {
            System.out.println(leftChild);
        }

        System.out.println(data);
        if (rightChild != null) {
            rightChild.traversalInOrder();
        }else {
            System.out.println(rightChild);
        }
    }

    public int min() {
        if (leftChild == null) {
            return this.data;
        } else {
            return leftChild.min();
        }
    }

    public int max() {
        if (rightChild == null) {
            return this.data;
        } else {
            return rightChild.max();
        }
    }

    public TreeNode get(int value) {
        if (value == data) {
            return this;
        }
        if (value < data) {
            if (leftChild != null) {
                return leftChild.get(value);
            }
        } else {
            if (rightChild != null) {
                return rightChild.get(value);
            }
        }
        return null;
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return this.leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return this.rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "{" + " data='" + getData() + "'" + ", leftChild='" + getLeftChild() + "'" + ", rightChild='"
                + getRightChild() + "'" + "}";
    }

}
