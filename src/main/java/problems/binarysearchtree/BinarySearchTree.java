package problems.binarysearchtree;

public class BinarySearchTree {

    public void test() {
        System.out.println("testSmallBinaryTree - Should be TRUE: " + testSmallBinaryTree());
        System.out.println("testBiggerBinaryTree - Should be TRUE: " + testBiggerBinaryTree());
        System.out.println("testFalseBinaryTree - Should be FALSE: " + testFalseBinaryTree());
        System.out.println("testFalseBinaryTree2 - Should be FALSE: " + testFalseBinaryTree2());
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
        //  1   3
        //
        // Response: FALSE since 3 is lower than 4 and is on the right side of 4
        Node node = new Node(5, new Node(4, new Node(1), new Node(3)), new Node(7));

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
        Node node = new Node(5, new Node(4, new Node(2), new Node(6)), new Node(7));

        return isValidBinaryTree(node);
    }

    /**
     * verify whether a BinaryTree is valid
     */
    public boolean isValidBinaryTree(Node binaryTree) {
        return isValidBinaryTreeHelper(binaryTree, 0, 100);
    }

    private boolean isValidBinaryTreeHelper(Node node, int minLimit, int maxLimit) {
        if (node == null) {
            return true;
        }

        return (node.value > minLimit && node.value < maxLimit &&
                isValidBinaryTreeHelper(node.left, minLimit, node.value) &&
                isValidBinaryTreeHelper(node.right, node.value, maxLimit));

    }
}

