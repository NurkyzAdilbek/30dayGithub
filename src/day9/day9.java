package day9;

public class day9 {
    public static void main(String[] args) {
        //1️⃣ Создание простого метода
        //Задание:
        //Создай класс Calculator с методом add, который
        // принимает два целых числа и возвращает их сумму.
        // В main вызови этот метод и выведи результат.

        System.out.println(add(4, 6));

        //3️⃣ Метод для проверки четного числа
        //Задание:
        // метод isEven,
        // который принимает целое число и возвращает true,
        // если оно четное, и false, если нечетное.
        System.out.println(isEven(8));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static boolean isEven(int num) {
        if (num % 2 == 0){
            return true;
        }
        return false;

    }
}
