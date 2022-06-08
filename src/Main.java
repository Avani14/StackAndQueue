import StackUsing_LinkedList.IQueue;
import StackUsing_LinkedList.IStack;
import StackUsing_LinkedList.Queue;
import StackUsing_LinkedList.Stack;

public class Main {
    public static void main(String[] args) {
        IStack<Integer> stack = new Stack<Integer>();
        //Use Case 1 Pushing the data in stack
        System.out.println("---Stack Operations---");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printData();
        System.out.println();
        // Use case 2 able to peek and pop
        System.out.println(stack.peek());
        stack.printData();
        System.out.println();
        System.out.println(stack.pop());
        stack.printData();
        System.out.println();
        System.out.println(stack.pop());
        stack.printData();
        System.out.println();
        System.out.println(stack.pop());
        stack.printData();
        System.out.println();
        //Queue Operations
        System.out.println("---Queue Operations---");
        IQueue<Integer> queue = new Queue<Integer>();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printData();
        System.out.println();
        System.out.println(queue.dequeue());
        queue.printData();
    }
}