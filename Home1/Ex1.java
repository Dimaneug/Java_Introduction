// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

package Home1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите n: ");
        int n = scanner.nextInt();
        System.out.printf("Треугольное число %d: %d\n", n, triangleNum(n));
        System.out.printf("Факториал %d: %d\n", n, fact(n));
        scanner.close();
    }

    public static int triangleNum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static int fact(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
