public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        bst.put(1, "1");
        bst.put(2, "2");
        bst.put(3, "3");
        bst.put(4, "4");
        bst.put(5, "5");
        bst.put(6, "6");

        System.out.println("4: " + bst.get(4));


    }
}