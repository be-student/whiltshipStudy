package whiltshipstudy.week4.stack;

public class Stack {

    private int[] stack;
    private int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public void push(int value) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }
        stack[++top] = value;
    }

    public int pop() {
        if (top == -1) {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
        return stack[top--];
    }
}
