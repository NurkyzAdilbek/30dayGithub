package day13;

public class ArrayZugriff {
    public static void main(String[] args) {


int []a=new int[19];
a[0]=2;
a[11]=9;
arrayZugriff(a);


    }


    static void arrayZugriff(int[] array) {

        try {
            System.out.println(array[20]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        e.getCause();
        }
    }
}
