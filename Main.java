class Stack {

    int[] arr = new int[5];
    int top = -1;

    void push(int value) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = value;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    int peek() {
        if (top == -1)
            return -1;

        return arr[top];
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class Main {
    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(5);
        s.push(10);
        s.push(15);

        System.out.println(s.peek());   // 15
        System.out.println(s.pop());    // 15
        System.out.println(s.peek());   // 10
    }
}