package day13;

public class ExceptionsWithFinally {

    public static void main(String[] args) {
          teilen(9,0);
    }


    static void teilen(int a, int b) {
        try {
            int c = a / b;
            System.out.println(c);
        }

        catch (ArithmeticException e) {
            System.out.println(e.getCause());
        }
catch (NumberFormatException e) {
            e.printStackTrace();

}
        finally {
            System.out.println("Finally ishtedi");
        }
    }

    static  void teilen(int...a){

    }
}
