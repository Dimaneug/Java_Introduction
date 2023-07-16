// Реализовать консольное приложение, которое:
// 1. Принимает от пользователя и “запоминает” строки.
// 2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а 
// первая - последней.
// 3. Если введено revert, удаляет предыдущую введенную строку из памяти.

package Sem4;

import java.util.Scanner;
import java.util.Stack;

public class Ex2 {
    public static void main(String[] args) {
        view();
    }

    public static void view() {
        Scanner scanner = new Scanner(System.in);
        Stack<String> stack = new Stack<String>();
        while (true) {
            System.out.println("print - вывод; revert - удаление последней; quit - выход");
            System.out.println("Введите строку:");
            String line = scanner.nextLine();
            if (line.equals("quit")) {
                break;
            } else if (line.equals("print")) {
                System.out.println(stack.toString());
            } else if (line.equals("revert")) {
                stack.pop();
            } else {
                stack.push(line);
            }
        }

        scanner.close();
    }
}
