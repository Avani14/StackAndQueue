package StackUsing_LinkedList;

public class Stack extends Common implements IStack{
    @Override
    public void push(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    @Override
    public int pop() {
        int data;
        Node temp = head;
        while(temp.next.next != null)
        {
            temp = temp.next;
        }
        data = temp.next.data;
        temp.next = null;
        return data;
    }

    @Override
    public int peek() {
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }

        return temp.data;
    }
}
