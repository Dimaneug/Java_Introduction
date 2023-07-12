// Заполнить список десятью случайными числами.
// Отсортировать список методом sort() и вывести его на экран.

package Sem3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        Collections.sort(list);
        System.out.println(list);
    }
}
