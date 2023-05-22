public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

//        bst.put(1, "1");
//        bst.put(2, "2");
//        bst.put(3, "3");
//        bst.put(4, "4");
//        bst.put(5, "5");
//        bst.put(6, "6");
//        bst.put(0, "0");
//        bst.put(-1, "-1");
//        bst.put(-2, "-2");

        bst.put(15, "15");
        bst.put(32, "32");
        bst.put(65, "65");
        bst.put(13, "13");
        bst.put(0, "0");
        bst.put(5, "5");
        bst.put(10, "10");
        bst.put(31, "31");
        bst.put(9, "9");
        bst.put(3, "3");


        System.out.println("Height: " + (bst.height()-1));



    }
}