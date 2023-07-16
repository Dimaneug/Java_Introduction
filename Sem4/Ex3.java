// 1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль 
// содержимое стэка.
// 2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль
// содержимое очереди.

package Sem4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6 };
        printStack(arr);
        printQueue(arr);
    }

    public static void printStack(int[] arr) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }

    public static void printQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<Integer>() {

        };
        for (int i = 0; i < arr.length; i++) {
            queue.add(arr[i]);
        }
        while (!queue.isEmpty()) {
            System.out.print(queue.poll()+" ");
        }
        System.out.println();
    }
}
