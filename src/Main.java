import StackUsing_LinkedList.IStack;
import StackUsing_LinkedList.Stack;

public class Main {
    public static void main(String[] args) {
        IStack stack = new Stack();
        System.out.println("---Stack Operations---");
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.printData();
    }
}