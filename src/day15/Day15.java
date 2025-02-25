package day15;

public class Day15 {
    public static void main(String[] args) {

        System.out.println(factorial(5));
        System.out.println(fibonacci(5));
        System.out.println(fibonacci(5));
    }
    public static int factorial(int n) {
        if (n == 0) {
            return 1; // Базовый случай
        }
        return n * factorial(n - 1); // Рекурсивный вызов
    }
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // Базовый случай
        } else if (n == 1) {
            return 1; // Базовый случай
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // Рекурсивный вызов
    }
    public static int sumDigits(int n) {
        if (n == 0) {
            return 0; // Базовый случай
        }
        return n % 10 + sumDigits(n / 10); // Рекурсивный вызов
    }
}
