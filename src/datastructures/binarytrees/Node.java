package datastructures.binarytrees;

public class Node<T extends Comparable<T>>{

    private Node left;
    private Node right;
    private Node parent;
    private T item;

    public Node(T item) {
        this.item = item;
        this.left = null;
        this.right = null;
        this.parent = null;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
