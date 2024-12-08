import java.util.Scanner;

class Stack {
    int[] stack;
    int top;
    int capacity;

    public Stack(int size) {
        stack = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int x) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow");
        } else {
            stack[++top] = x;
        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public boolean isEmpty() {
        return top == -1;
    }
}

public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        System.out.println("Popped element: " + stack.pop());
    }
}
