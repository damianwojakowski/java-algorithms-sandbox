import problems.binarysearchtree.BinarySearchTree;
import problems.ransomnote.RansomNote;

class Main {
    public static void main(String[] args) {
//        Main.doBinarySearch();
        Main.doRansomeNoteCheck();
    }

    private static void doBinarySearch() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.test();
    }

    private static void doRansomeNoteCheck() {
        RansomNote ransomNote = new RansomNote();
        ransomNote.test();
    }
}