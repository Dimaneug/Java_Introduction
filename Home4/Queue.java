// Реализуйте очередь с помощью LinkedList со следующими методами:enqueue() - помещает элемент в 
// конец очереди, dequeue() - возвращает первый элемент из очереди и удаляет его, first() - 
// возвращает первый элемент из очереди, не удаляя.

package Home4;

import java.util.LinkedList;

public class Queue {

    LinkedList<Integer> queue;

    public Queue() {
        queue = new LinkedList<Integer>();
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        System.out.println("Первый в очереди - " + queue.first());
        System.out.println("Удаляем из очереди - " + queue.dequeue());
        System.out.println("Первый в очереди - " + queue.first());
    }

    public void enqueue(int num) {
        queue.addLast(num);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int first() {
        return queue.getFirst();
    }

}
