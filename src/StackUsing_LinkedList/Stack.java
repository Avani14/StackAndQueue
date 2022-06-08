package StackUsing_LinkedList;

public class Stack<E> extends Common<E> implements IStack<E>{
    @Override
    public void push(int data) {
        Node node = new Node(data);
        node.setNext(head);
        head = node;
    }

    @Override
    public E pop() {
        Node temp = head;
        Node prev = head;
        while(temp.getNext() != null) {
            prev = temp;
            temp = temp.getNext();
        }
        prev.setNext(null);
        return (E) temp.getData();
    }

    @Override
    public E peek() {
        Node temp = head;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }
}
