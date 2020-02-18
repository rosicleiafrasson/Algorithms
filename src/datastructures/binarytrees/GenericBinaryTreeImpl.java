package datastructures.binarytrees;

public class GenericBinaryTreeImpl<T extends Comparable <T>> implements GenericBinaryTree<T> {

    private Node root;
    private int size;

    public GenericBinaryTreeImpl(){
        this.root = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return this.size;
    }


    @Override
    public boolean contains(T item) {
        if (root == null){
            return false;
        }
        return false;
    }

    @Override
    public void insert(T item) {
        Node nodeInsert = new Node(item);
        root = addNode(root, nodeInsert);

    }

    @Override
    public boolean delete(T item) {
        if (root == null){
            return false;
        }
        return false;
    }


    @Override
    public String inOrder() {
        StringBuilder msg = new StringBuilder();
        return inOrder(root, msg);
    }

    @Override
    public String preOrder() {
        StringBuilder msg = new StringBuilder();
        return preOrder(root, msg);
    }

    @Override
    public String posOrder() {
        StringBuilder msg = new StringBuilder();
        return posOrder(root, msg);
    }



    private Node addNode(Node parent, Node insert) {
        if(parent == null) {
            parent = insert;
            size++;
            return parent;
        }else {
            if (insert.getItem().compareTo(parent.getItem()) < 0) {
                parent.setLeft(addNode(parent.getLeft(), insert));
            } else if (insert.getItem().compareTo(parent.getItem()) > 0) {
                parent.setRight(addNode(parent.getRight(), insert));
            }
        }
        return parent;
    }

    private String inOrder(Node node, StringBuilder msg) {
        if(node != null){
            inOrder(node.getLeft(), msg);
            msg.append(node.getItem().toString());
            inOrder(node.getRight(),msg);
        }
        return msg.toString();
    }

    private String preOrder(Node node, StringBuilder msg) {
        if(node != null){
            msg.append(node.getItem().toString());
            preOrder(node.getLeft(), msg);
            preOrder(node.getRight(),msg);
        }
        return msg.toString();
    }

    private String posOrder(Node node, StringBuilder msg) {
        if(node != null){
            posOrder(node.getLeft(), msg);
            posOrder(node.getRight(),msg);
            msg.append(node.getItem().toString());
        }
        return msg.toString();
    }


}
