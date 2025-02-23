package day13;

import java.util.ArrayList;
import java.util.List;

public class ArithmetikException {
    public static void main(String[] args) {
       try {
           int a = 10;
        int b = 0;

        System.out.println(a / b);}
       catch (ArithmeticException e) {
           e.printStackTrace();
       }
        List<Integer> liste = new ArrayList<>();
    }
}
