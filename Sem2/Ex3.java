// Напишите метод, который принимает на вход строку (String) и определяет является ли строка 
// палиндромом (возвращает boolean значение).

package Sem2;

public class Ex3 {
    public static void main(String[] args) {
        String str = "шалаш";
        boolean res = isPalindrom(str);
        System.out.println(res);
    }

    public static boolean isPalindrom(String str) {
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-1-i)) return false;
        }
        return true;
    }
}
