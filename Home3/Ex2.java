// Пусть дан произвольный список целых чисел, удалить из него четные числа

package Home3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        removeEvenNums(list);
        System.out.println(list);
    }

    public static void removeEvenNums(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) list.remove(i);
        }
    }
}
