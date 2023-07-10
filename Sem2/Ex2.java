// Напишите метод, который сжимает строку. 
// Пример:
// вход: aaaabbbcdd результат: a4b3c1d2

package Sem2;

public class Ex2 {
    public static void main(String[] args) {
        String str = "aaaabbbcdd";
        String res = compressString(str);
        System.out.println(res);
    }

    public static String compressString(String str) {
        StringBuilder sb = new StringBuilder();
        char prevChar = str.charAt(0);
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == prevChar) {
                count++;
            } else {
                sb.append(prevChar);
                sb.append((char)(count+'0'));
                count = 1;
            }
            prevChar = str.charAt(i);
        }
        sb.append(prevChar);
        sb.append((char)(count+'0'));
        return sb.toString();
    }
}
