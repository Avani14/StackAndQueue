package StackUsing_LinkedList;

public interface IStack<E> extends ICommon<E>{

        void push(int data);
        E pop();
        E peek();

}
