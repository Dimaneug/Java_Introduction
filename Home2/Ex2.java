// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации 
// запишите в лог-файл.

package Home2;

import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ex2 {
    static Logger logger = Logger.getLogger(Ex2.class.getName());
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("log");
            logger.addHandler(fh);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "не удалось создать логгер", e);
        }

        int[] arr = new int[]{6,3,5,8,2,9};
        arr = bubbleSort(arr);
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int tmp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if (arr[j]>arr[j+1]) {
                    tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
                logger.log(Level.INFO, Arrays.toString(arr));
            }
        }
        return arr;
    }
}
