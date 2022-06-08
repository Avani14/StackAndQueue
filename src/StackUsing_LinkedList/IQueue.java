package StackUsing_LinkedList;

public interface IQueue<E> extends ICommon<E>{
    void enqueue(E data);
    E dequeue();
}
