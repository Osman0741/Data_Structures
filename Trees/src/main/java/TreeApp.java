public class TreeApp {
    public static void main(String[] args) {
        MyTree tree = new MyTree();
        int[] numbers = new int[]{10, 6, 8, 20, 4, 9, 5, 17, 42, 47, 29};
        for (int i = 0; i < numbers.length; i++) {
            tree.insert(numbers[i]);
        }
        VisualizeTree.printTree(tree.root,null,false);

        tree.preOrderTraversal(tree.root);
        System.out.println();
        System.out.println("Level Order Traversal");
        tree.levelOrderTraversal();
        System.out.println();
        tree.printLeaves(tree.root);
        System.out.println();
        System.out.println(tree.height(tree.root));

    }
}
