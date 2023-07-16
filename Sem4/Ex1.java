// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя строку вида
// text~num
// 2. Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
// 3. Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.

package Sem4;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        view();
    }

    public static void view() {
        Scanner scanner = new Scanner(System.in);
        List<String> linkedList = new LinkedList<String>();
        while (true) {
            System.out.println("Введите строку типа text~num\nprint~num для удаления\nquit для выхода");
            String[] line = scanner.nextLine().split("~");
            if (line[0].equals("quit"))
                break;
            int position = Integer.parseInt(line[1]);
            if (position > linkedList.size() || position < 0) {
                System.out.println("Неправильный индекс!");
                continue;
            }
            if (line[0].equals("print")) {
                System.out.println(linkedList.remove(position));
            } else {
                linkedList.add(position, line[0]);
            }
        }
        scanner.close();
    }
}
