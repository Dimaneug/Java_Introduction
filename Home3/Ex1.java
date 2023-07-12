// Реализовать алгоритм сортировки слиянием

package Home3;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 6, 5, 3, 1, 8, 7, 2, 4 };
        arr = mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1)
            return arr;

        int middle = arr.length / 2;
        int[] sorted1 = mergeSort(Arrays.copyOfRange(arr, 0, middle));
        int[] sorted2 = mergeSort(Arrays.copyOfRange(arr, middle, arr.length));

        return merge(sorted1, sorted2);
    }

    public static int[] merge(int[] left, int[] right) {
        int leftIndex = 0;
        int rightIndex = 0;
        int[] res = new int[left.length + right.length];

        while (leftIndex < left.length || rightIndex < right.length) {
            // проверяем, не закончились ли элементы в одной из половин
            if (leftIndex == left.length) {
                res[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
                continue;
            } else if (rightIndex == right.length) {
                res[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
                continue;
            }

            if (left[leftIndex] < right[rightIndex]) {
                res[leftIndex + rightIndex] = left[leftIndex];
                leftIndex++;
            } else {
                res[leftIndex + rightIndex] = right[rightIndex];
                rightIndex++;
            }
        }
        return res;
    }
}
