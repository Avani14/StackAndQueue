package StackUsing_LinkedList;

public class Queue extends Common implements IQueue{
    @Override
    public void enqueue(int data) {
        Node node = new Node(data);
        if(head == null)
        {
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = node;
    }

    @Override
    public int dequeue() {
        if(head == null)
        {
            System.out.println("The queue is empty");
            return 0;
        }
        int data = head.data;
        head = head.next;
        return data;
    }
}
