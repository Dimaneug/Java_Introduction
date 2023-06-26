// Дан массив двоичных чисел, например [1,1,0,1,1,1], 
// вывести максимальное количество подряд идущих 1.

package Sem1;

public class Count_Ones {
    public static void main(String[] args) {
        short[] arr = new short[] { 1, 1, 0, 1, 1, 1 };

        System.out.println(countOnes(arr));
    }

    public static int countOnes(short[] arr) {
        int count = 0;
        int maxCount = 0;
        for (short val : arr) {
            if (val == 1)
                count++;
            else if (val == 0) {
                if (count > maxCount)
                    maxCount = count;
                count = 0;
            }
        }
        return maxCount > count ? maxCount : count;
    }
}
