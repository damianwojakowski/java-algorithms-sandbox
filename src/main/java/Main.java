import problems.binarysearchtree.BinarySearchTree;

class Main {
    public static void main(String[] args) {
        Main.doBinarySearch();
    }

    private static void doBinarySearch() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        System.out.println("is Binary Tree? - " + binarySearchTree.test());
    }
}