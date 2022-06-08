package StackUsing_LinkedList;

public class Queue<E> extends Common<E> implements IQueue<E>{
    @Override
    public void enqueue(E data) {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.getNext() != null)
        {
            temp = temp.getNext();
        }
        temp.setNext(node);
    }

    @Override
    public E dequeue() {
        if(head == null)
        {
            System.out.println("The queue is empty");
            return (E) null;
        }
        E data = (E) head.getData();
        head = head.getNext();
        return data;
    }
}
