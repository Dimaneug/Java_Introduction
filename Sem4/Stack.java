// Реализовать стэк с помощью массива. Нужно реализовать методы:
// size(), empty(), push(), peek(), pop().

package Sem4;

public class Stack {
    int[] stack;
    int top;

    public Stack(int size) {
        stack = new int[size];
        top = -1;
    }

    public int size() {
        return top+1;
    }

    public boolean empty() {
        return top == -1;
    }

    public void push(int num) {
        top++;
        stack[top] = num;
    }

    public int peek() {
        if (empty()) {
            throw new IllegalStateException("Стэк пустой!");
        }
        return stack[top];
    }

    public int pop() {
        if (empty()) {
            throw new IllegalStateException("Стэк пустой!");
        }
        return stack[top--];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(100);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Size of stack - " + stack.size());
        System.out.println("Stack pop - " + stack.pop());
        System.out.println("Size of stack - " + stack.size());

    }
}
