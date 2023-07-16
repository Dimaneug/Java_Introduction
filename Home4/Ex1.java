// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” 
// список.

package Home4;

import java.util.LinkedList;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        List<Integer> linkedList = new LinkedList<Integer>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        List<Integer> revertList = revertList(linkedList);
        System.out.println(revertList.toString());
    }

    public static List<Integer> revertList(List<Integer> list) {
        List<Integer> newList = new LinkedList<Integer>();
        for (int i = list.size()-1; i >= 0; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }
}
