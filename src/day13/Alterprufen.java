package day13;

public class Alterprufen
{
    public static void main(String[] args) throws Exception {

//        try {
//            alter(17);
//        } catch (IllegalArgumentException e) {
//            System.out.println("Fehler: " + e.getMessage());
//        }
        try {
            division(9,0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }



    }



    static void alter(int alter) {

        try {
            if (alter < 18) {
                throw new IllegalArgumentException("Alter exception");
            }

        } finally {
            System.out.println("Richtig");
        }
    }


    static void division(int a, int b) {
        try {
            System.out.println(a / b);
            if (b == 0) {
                throw new ArithmeticException(" Kann ncit dividiert werden");
            }

        } finally {
            System.out.println(a +" dividiert durch "+b);
        }
    }
}
