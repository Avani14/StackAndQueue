package StackUsing_LinkedList;

public class Common<E> implements ICommon<E>{
    Node head;
    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int size() {
        Node temp = head;
        int count=0;
        while(temp != null)
        {
            temp = temp.getNext();
            count++;
        }

        return count;
    }

    @Override
    public void printData() {
        Node temp = head;
        while(temp!= null)
        {
            System.out.print(temp.getData()+"-->");
            temp = temp.getNext();
        }
    }
}
