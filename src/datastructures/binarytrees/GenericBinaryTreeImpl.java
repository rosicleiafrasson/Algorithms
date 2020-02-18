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
        return contains(root, item);
    }

    @Override
    public void insert(T item) {
        Node nodeInsert = new Node(item);
        root = addNode(root, nodeInsert);

    }

    @Override
    public boolean delete(T item) {
        return delete(root, item);
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

    private boolean contains(Node parent, T item){
        if(parent == null){
            return false;
        }
        if(parent.getItem().compareTo(item) < 0){
            return contains(parent.getRight(), item);
        }else if(parent.getItem().compareTo(item) > 0){
            return contains(parent.getLeft(), item);
        }else{
            return true;
        }

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

    private boolean delete(Node parent, T item){
        if(parent == null){
            return false;
        }
        if(parent.getItem().compareTo(item) < 0){
            return delete(parent.getRight(), item);
        }else if(parent.getItem().compareTo(item) > 0){
            return delete(parent.getLeft(), item);
        }else{
            deletion(parent);
            return true;
        }
    }

    private void deletion(Node node){
        if(node.getLeft() == null && node.getRight() == null){
            node = null;
        }else if(node.getLeft() != null && node.getRight() == null){
            Node parent = node.getParent();
            node = node.getLeft();
            node.setParent(parent);
        }else if(node.getRight() != null && node.getLeft() == null){
            Node parent = node.getParent();
            node = node.getRight();
            node.setParent(parent);
        }else{
            Node substitute = getNodeMinValue(node);
            substitute.getParent().setLeft(null);
            node.setItem(substitute.getItem());
            
        }
    }

    private Node getNodeMinValue(Node node){
        if(node.getLeft() != null){
            return getNodeMinValue(node.getLeft());
        }
        return node;
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
