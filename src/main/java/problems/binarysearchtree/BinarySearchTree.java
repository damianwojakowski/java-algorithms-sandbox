package problems.binarysearchtree;

public class BinarySearchTree {

    public boolean test() {
//        return testSmallBinaryTree();
//        return testBiggerBinaryTree();
        return testFalseBinaryTree();
    }

    private boolean testSmallBinaryTree() {
        // Binary Tree:
        //
        //      5
        //     / \
        //    4   7
        //
        Node node = new Node(5, new Node(4, null, null), new Node(7, null, null));

        return isValidBinaryTree(node);
    }

    private boolean testBiggerBinaryTree() {
        // Binary Tree:
        //
        //      5
        //     / \
        //    3   7
        //   / \
        //  1   4
        Node node = new Node(5, new Node(3, new Node(1), new Node(4)), new Node(7));

        return isValidBinaryTree(node);
    }

    private boolean testFalseBinaryTree() {
        // Binary Tree:
        //
        //      5
        //     / \
        //    4   7
        //   / \
        //  2   3
        //
        // Response: FALSE since 3 is lower than 4 and is on the right side of 4
        Node node = new Node(5, new Node(4, new Node(1), new Node(4)), new Node(7));

        return isValidBinaryTree(node);
    }

    private boolean testFalseBinaryTree2() {
        // Binary Tree:
        //
        //      5
        //     / \
        //    4   7
        //   / \
        //  2   6
        //
        // Response: should be FALSE since 6 is higher than first node and is on the left side of first node
        Node node = new Node(5, new Node(4, new Node(1), new Node(4)), new Node(7));

        return isValidBinaryTree(node);
    }

    /**
     * verify whether a BinaryTree is valid
     */
    public boolean isValidBinaryTree(Node binaryTree) {
        return isValidBinaryTreeHelper(binaryTree);
    }

    private boolean isValidBinaryTreeHelper(Node node) {
        if (node == null || node.right == null && node.left == null) {
            return true;
        }

        return (node.left.value < node.value && node.right.value > node.value) &&
                isValidBinaryTreeHelper(node.left) &&
                isValidBinaryTreeHelper(node.right);

    }
}

