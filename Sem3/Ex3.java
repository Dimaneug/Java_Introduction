// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package Sem3;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("test");
        list.add("123");
        list.add("1");
        list.add("321");

        removeDigits(list);

        System.out.println(list);

    }

    public static void removeDigits(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if (isDigit(list.get(i))) {
                list.remove(i);
                i--;
            }
        }
    }

    public static boolean isDigit(String val) {
        try {
            Integer.parseInt(val);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
