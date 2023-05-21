import java.util.List;
import java.util.ArrayList;

public class BST<K extends Comparable<K>, V> {
    private Node root;

    private class Node {
        private K key;
        private V val;
        private Node left, right;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    private Node put(Node node, K key, V val) {

        if (node == null) return new Node(key, val);

        int cccc = key.compareTo( node.key );

        if (cccc < 0) node.left = put(node.left, key, val);
        else if (cccc > 0) node.right = put(node.right, key, val);
        else node.val = val;
        return node;

    }

    public void put(K key, V value) {

        root = put(root, key, value);

    }

    private Node get(Node node, K key) {

        if (node == null) return null;

        int cmp = key.compareTo(node.key);

        if (cmp < 0) return get(node.left, key);
        else if (cmp > 0) return get(node.right, key);
        else return node;

    }

    public V get(K key) {

        Node nod = get(root, key);
        return nod != null ? nod.val : null;

    }

    public void delete(K key) {

        root = delete(root, key);

    }

    private Node delete(Node node, K key) {
        if (node == null)   return null;

        int cmp = key.compareTo(node.key);

        if (cmp < 0) {
            node.left = delete(node.left, key);
        }
        else if (cmp > 0) {
            node.right = delete(node.right, key);
        }
        else {

            if (node.left == null) {
                return node.right;
            }
            else if (node.right == null) {
                return node.left;
            }
            else {
                Node minRightNode = findMin(node.right);
                node.key = minRightNode.key;
                node.val = minRightNode.val;
                node.right = delete(node.right, minRightNode.key);
            }

        }
        return node;
    }

    public Node findMin(Node node) {

        while (node.left != null) {
            node = node.left; }
        return node;

    }

    public Iterable<K> iterator() {

        List<K> keysss = new ArrayList<>();
        inorderTraversal(root, keysss);
        return keysss;

    }

    private void inorderTraversal(Node node, List<K> keys) {

        if (node == null) return;

        inorderTraversal(node.left, keys);

        keys.add(node.key);
        inorderTraversal(node.right, keys);

    }

    public int size() {

        return size(root);

    }

    private int size(Node node) {

        if (node == null) return 0;
        else return 1 + size(node.left) + size(node.right);

    }
}