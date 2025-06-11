package Models;

import java.util.EmptyStackException;

public class LinkedList<T> {
//-------------------------------------------------------------------------------
    private Node<T> head;
    private int size;
//-------------------------------------------------------------------------------
    public void appendToTail(T value){

        Node<T> newNode = new Node<>(value);
        newNode.setNode(head);
        head = newNode;
        size++;
    }
//-------------------------------------------------------------------------------
    public T findByValue(T value){

        Node<T> current = head;

        while (current != null) {

            if (current.getValue().equals(value)) {
                return current.getValue();
            }
            current = current.getNode();
        }

        return null;
    }
//-------------------------------------------------------------------------------
    public void deleteByValue(T value){

        if (head == null){
            throw new EmptyStackException();
        }
    
        if (head.getValue().equals(value)) {
            head = head.getNode();
            size--;
            return ;
        }   
    }
//-------------------------------------------------------------------------------
    public void print(){

        Node<T> aux = head;
        
        while (aux != null) {
            
            System.out.print(aux.getValue() + " | ");
            aux = aux.getNode();
        }
    }
//-------------------------------------------------------------------------------
    public Node<T> getHead() {
        return head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
//-------------------------------------------------------------------------------
    
}
