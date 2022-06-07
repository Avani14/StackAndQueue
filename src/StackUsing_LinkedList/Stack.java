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
        Node temp = head;
        Node prev = head;
        while(temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = null;
        return temp.data;
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
