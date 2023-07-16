// В калькулятор добавьте возможность отменить последнюю операцию.

package Home4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    float previous;
    float result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();
        System.out.println("quit - выход, undo - отменить последнюю операцию");
        System.out.println("Формат выражения - \"1 + 1\" или \"+ 1\", если уже есть результат");
        while (true) {
            System.out.print("\nВведите выражение: ");  
            String expression = scanner.nextLine();
            if (expression.equals("quit")) {
                break;
            } else if (expression.equals("undo")) {
                System.out.printf("\n%.6f\n", calc.undo());
            } else {
                System.out.printf("\n%.6f\n", calc.parseExpression(expression));
            }

        }
        scanner.close();
    }

    public float calculate(float a, float b, char operation) {
        previous = result;
        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                if (b == 0.0)
                    result = 0;
                result = a / b;
                break;
            default:
                return -1;
        }
        return result;
    }

    public float parseExpression(String expression) throws InputMismatchException {
        String[] params = expression.split(" ");
        float a, b;
        char operation;
        if (params.length == 3) {
            a = Float.parseFloat(params[0]);
            b = Float.parseFloat(params[2]);
            operation = params[1].charAt(0);
        } else if (params.length == 2) {
            a = result;
            operation = params[0].charAt(0);
            b = Float.parseFloat(params[1]);
        } else {
            throw new InputMismatchException("Неправильный ввод!");
        }
        return calculate(a, b, operation);
    }

    public float undo() {
        result = previous;
        return previous;
    }
}
