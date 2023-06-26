// Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
// Если общего префикса нет, вернуть пустую строку "".

package Sem1;

public class Ex4 {
    public static void main(String[] args) {
        String[] str = {"flower", "flow", "flight"};
        System.out.println(findPrefix(str));
    }

    public static String findPrefix(String[] arr) {
        String prefix = "";
        int cIndex = 0;
        char ch;
        while (true) {
            ch = arr[0].charAt(cIndex);
            for (String string : arr) {
                if (string.length() < cIndex) {
                    return prefix;
                }
                if (string.charAt(cIndex) != ch) {
                    return prefix;
                }
            }
            prefix += ch;
            cIndex++;
        }
    }
}
