// Напишите метод, который вернет содержимое текущей папки в виде массива строк.
// Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
// Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно 
// должно записаться в лог-файл.

package Sem2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex5 {
    static Logger logger = Logger.getLogger(Ex5.class.getName());

    public static void main(String[] args) {
        FileHandler fileHandler;
        try {
            fileHandler = new FileHandler("log.txt");
            logger.addHandler(fileHandler);
        } catch (Exception e) {
            System.out.println("Logger не создан");
            System.out.println(e.getMessage());
        }
        writeFile(getFiles());
    }

    public static String[] getFiles() {
        File file = new File(".");
        return file.list();
    }

    public static void writeFile(String[] strArr) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("output1.txt", false))) {
            for (String str : strArr) {
                bw.write(str);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.log(Level.WARNING, e.getMessage());
        }
    }
}
