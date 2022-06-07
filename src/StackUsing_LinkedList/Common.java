package StackUsing_LinkedList;

public class Common implements ICommon{
    Node head;
    @Override
    public boolean isEmpty() {
        if(head == null)
        {
            return true;
        }

        return false;
    }

    @Override
    public int size() {
        Node temp = head;
        int count=0;
        while(temp != null)
        {
            temp = temp.next;
            count++;
        }

        return count;
    }

    @Override
    public void printData() {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
    }
}
