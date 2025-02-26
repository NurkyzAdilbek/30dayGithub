import java.util.Arrays;

public class Day16 {

    // Пузырьковая сортировка
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // Если не было перестановок, массив уже отсортирован
        }
    }

    // Сортировка выбором
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    // Тестирование алгоритмов
    public static void main(String[] args) {
        int[] array1 = {64, 34, 25, 12, 22, 11, 90};
        int[] array2 = array1.clone();

        System.out.println("Исходный массив: " + Arrays.toString(array1));

        bubbleSort(array1);
        System.out.println("После пузырьковой сортировки: " + Arrays.toString(array1));

        selectionSort(array2);
        System.out.println("После сортировки выбором: " + Arrays.toString(array2));
    }
}
