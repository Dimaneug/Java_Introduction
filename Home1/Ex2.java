// Вывести все простые числа от 1 до 1000

package Home1;

import java.util.BitSet;

public class Ex2 {
    public static void main(String[] args) {
        printPrimeNumbers(1000);
    }

    public static void printPrimeNumbers(int upper) {

        // boolean isPrime;
        // for (int i = 2; i <= upper; i++) {
        // isPrime = true;
        // for (int j = 2; j < i; j++) {
        // if (i % j == 0) {
        // isPrime = false;
        // break;
        // }
        // }
        // if (isPrime)
        // System.out.printf("%d ", i);
        // }

        var sieve = new BitSet(upper);
        sieve.set(0, upper - 1, true);
        sieve.set(0, false);
        sieve.set(1, false);

        for (int i = 2; i * i < sieve.length(); i++) {
            if (sieve.get(i)) {
                for (int j = i * i; j < sieve.length(); j += i) {
                    sieve.set(j, false);
                }
            }
        }

        for (int i = 0; i < sieve.length(); i++) {
            if (sieve.get(i))
                System.out.printf("%d ", i);
        }
        System.out.println();
    }
}
