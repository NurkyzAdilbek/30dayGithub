import java.util.Scanner;

public class day5 {
    public static void main(String[] args) {
        //Целое число: 10
        //Дробное число: 5.7
        //Символ: A
        //Логическое значение: true
        //Строка: Привет, Java!

        int a=10;
        double j=5.7;
        char d='A';
        boolean boolea=true;
        String word="Hello JAVA";
//Aufgabe 2
        //Сумма: 11
        //Разность: 5
        //Произведение: 24
        //Частное: 2
        //Остаток от деления: 2
        Scanner sc=new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();
        int plus=number1+number2;
        System.out.println();
        int minus=number1-number2;
        System.out.println(minus);
        int div=number1/number2;
        System.out.println(div);
        int mod=number1%number2;
        System.out.println(mod);
        int kobotuu=number1*number2;
        System.out.println(kobotuu);

        //Aufgabe3
        int num = 10;
        double e = num; // Неявное приведение (int -> double)
        double pi = 3.14;
        int piInt = (int) pi; // Явное приведение (double -> int)
        char letter = 'A';
        int letterCode = letter;

//Aufgabe4
        final double PI = 3.14159;
        double r= sc.nextInt();
        double result=(PI*r)/2;
        System.out.println(result);

    }
}
