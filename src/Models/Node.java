package Models;

public class Node<T> {
//-------------------------------------------------------------------------------
    private T value;
    private Node<T> node;
//-------------------------------------------------------------------------------
    public Node(T value) {
        this.value = value;
    }
//-------------------------------------------------------------------------------
    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNode() {
        return node;
    }

    public void setNode(Node<T> node) {
        this.node = node;
    }
//-------------------------------------------------------------------------------
    
}
