package StackUsing_LinkedList;

public class Node <E>{
    private E data;

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    private Node next;
    public Node(E data)
    {
        this.data = data;
        this.next = null;
    }
}
