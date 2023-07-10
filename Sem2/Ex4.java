// Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод, который 
// запишет эту строку в простой текстовый файл, обработайте исключения.

package Sem2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex4 {
    public static void main(String[] args) {
        String str = createString();
        writeFile(str);
    }

    public static void writeFile(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt", false))) {
            bw.write(str);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static String createString() {
        StringBuilder sb = new StringBuilder();
        String str = "TEST";
        int n = 100;
        for (int i = 0; i < n; i++) {
            sb.append(str);
        }
        return sb.toString();
    }
}
