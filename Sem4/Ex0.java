// 1) Замерьте время, за которое в ArrayList добавятся 10000 элементов.
// 2) Замерьте время, за которое в LinkedList добавятся 10000 элементов. 
// Сравните с предыдущим.

package Sem4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex0 {
    public static void main(String[] args) {
        System.out.println("ArrayList to end - " + arrayListAddEnd());
        System.out.println("LinkedList to end - " + linkedListAddEnd());

        System.out.println("ArrayList to start - " + arrayListAddStart());
        System.out.println("LinkedList to start - " + linkedListAddStart());

        System.out.println("ArrayList to middle - " + arrayListAddMiddle());
        System.out.println("LinkedList to middle - " + linkedListAddMiddle());
    }

    public static long arrayListAddEnd() {
        List<Integer> arrayList = new ArrayList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            arrayList.add(i);
        }
        return System.currentTimeMillis()-start;
    }

    public static long linkedListAddEnd() {
        List<Integer> linkedList = new LinkedList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            linkedList.add(i);
        }
        return System.currentTimeMillis()-start;
    }

    public static long arrayListAddStart() {
        List<Integer> arrayList = new ArrayList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(0, i);
        }
        return System.currentTimeMillis()-start;
    }

    public static long linkedListAddStart() {
        List<Integer> linkedList = new LinkedList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(0, i);
        }
        return System.currentTimeMillis()-start;
    }

    public static long arrayListAddMiddle() {
        List<Integer> arrayList = new ArrayList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(arrayList.size()/2, i);
        }
        return System.currentTimeMillis()-start;
    }

    public static long linkedListAddMiddle() {
        List<Integer> linkedList = new LinkedList<Integer>(); 
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(linkedList.size()/2, i);
        }
        return System.currentTimeMillis()-start;
    }
}
