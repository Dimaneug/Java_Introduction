// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Home3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(findMin(list));
        System.out.println(findMax(list));
        System.out.println(findAverage(list));
    }

    public static int findMin(List<Integer> list) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) min = list.get(i);
        }
        return min;
    }

    public static int findMax(List<Integer> list) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > max) max = list.get(i);
        }
        return max;
    }

    public static double findAverage(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return (double) total/list.size();
    }
}
