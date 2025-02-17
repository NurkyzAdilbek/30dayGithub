public class day7 {
    public static void main(String[] args) {

        System.out.println(summ(4));
//        geradeZahle();
        tablisa(5);
    }

    //Сумма чисел от 1 до N (с использованием цикла for)
    // Напиши программу, которая вычисляет сумму чисел от 1 до N,
    // где N — целое положительное число, введённое пользователем.
    public  static int summ(int n){
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    //Вывод всех четных чисел от 1 до 100 (с использованием цикла while)
    // Напиши программу, которая выводит все четные числа от 1 до 100.
    public static void geradeZahle(){
        int i = 1;

        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i + "  gerade Zahl");
            } else {
                System.out.println(i + " ungerade Zahl");
            }
            i++;

        }
    }
    //Печать таблицы умножения
    // Напиши программу, которая печатает таблицу умножения для числа,
    // введённого пользователем (например, умножение на числа от 1 до 10).

    public static void tablisa(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println( i+" * "+j+" = "+(i*j));
            }
        }
    }
}
