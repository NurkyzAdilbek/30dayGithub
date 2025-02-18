import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {
        // Пример работы метода:
        int[] numbers = {3, 7, 2, 9, 5};
        int max = findMax(numbers);
        System.out.println(max); // 9
    }

    public static int findMax(int[] numbers) {
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int max = numbers[0]; // Начинаем с первого элемента

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i]; // Обновляем максимум
            }
        }
        return max;
    }
}
