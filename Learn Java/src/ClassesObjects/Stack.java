package ClassesObjects;
// Create a Stack class with an int[] array and an int top field. Implement push and pop using only these instance fields.

public class Stack {

    private final int[] data;
    private int top;

    Stack(int capacity) {
        data = new int[capacity];
        top = -1;
    }

    public void push(int value) {
        data[top + 1] = value;
        top++;
    }

    public int pop() {
        int value = data[top];
        top--;
        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack.size());       // 3
        System.out.println(stack.pop());        // 30  (last in, first out)
        System.out.println(stack.pop());        // 20
        System.out.println(stack.size());       // 1
        System.out.println(stack.isEmpty());    // false
        stack.pop();
        System.out.println(stack.isEmpty());    // true
    }
}