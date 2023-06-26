// Дан массив nums = [3,2,2,3] и число val = 3.
// Если в массиве есть числа, равные заданному, нужно перенести
// эти элементы в конец массива.
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
// а остальные - равны ему.

package Sem1;

public class Ex3 {
    public static void main(String[] args) {
        short[] nums = new short[] { 3, 2, 2, 3 };
        short val = 3;
        nums = sortByVal(nums, val);
        printArr(nums);
    }

    public static void printArr(short[] arr) {
        for (short val : arr) {
            System.out.printf("%d ", val);
        }
        System.out.println();
    }

    public static short[] sortByVal(short[] nums, short val) {
        int len = nums.length - 1;

        for (int i = len; i >= 0; i--) {
            if (nums[i] == val) {
                swap(nums, i, len--);
            }
        }
        return nums;
    }

    public static short[] swap(short[] arr, int i, int len) {
        short temp = arr[i];
        arr[i] = arr[len];
        arr[len] = temp;
        return arr;
    }
}
