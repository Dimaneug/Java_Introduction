// Реализовать простой калькулятор

package Home1;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите выражение через пробел (1 + 1):");
        String expression = scanner.nextLine();
        System.out.printf("%.6f\n", parseExpression(expression));
        scanner.close();
    }

    public static float calculate(float a, float b, char operation) {
        switch (operation) {
            case '+':
                return a+b;
            case '-':
                return a-b;
            case '*':
                return a*b;
            case '/':
                if (b==0.0) return 0;
                return a/b;
            default:
                return -1;
        }
    }

    public static float parseExpression(String expression) {
        String[] params = expression.split(" ");
        float a = Float.parseFloat(params[0]);
        float b = Float.parseFloat(params[2]);
        char operation = params[1].charAt(0);
        return calculate(a, b, operation);

    }
}
