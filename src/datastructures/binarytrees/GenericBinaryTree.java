package datastructures.binarytrees;

public interface GenericBinaryTree<T extends Comparable <T>> {
    int size();
    boolean contains(T item);
    void insert(T item);
    boolean delete(T item);
    String preOrder();
    String inOrder();
    String posOrder();
}
