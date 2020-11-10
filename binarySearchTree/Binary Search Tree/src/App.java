public class App {
    public static void main(String[] args) throws Exception {

        Tree myTree = new Tree();

        myTree.insert(25);
        myTree.insert(20);
        myTree.insert(15);
        myTree.insert(27);
        myTree.insert(30);
        myTree.insert(29);
        myTree.insert(26);
        myTree.insert(32);

        // System.out.println();

        // System.out.println("Data: " + myTree.get(15));
        // System.out.println("Data: " + myTree.get(258));

         myTree.traverse();

        // System.out.println("Min: " + myTree.min());
        // System.out.println("Max: " + myTree.max());

    }
}
