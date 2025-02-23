package day13;

import java.util.Scanner;

public class Exc {
    //Aufgabe 2: Umgang mit einer NumberFormatException Erstelle ein Programm,
    // das den Benutzer nach
    // einer Zahl fragt. Wenn der
    // Benutzer etwas anderes als eine Zahl eingibt, fange die NumberFormatException ab
    //
    // und gebe eine Fehlermeldung aus.
    public static void main(String[] args) {


        System.out.println("Weiter geht’s!");

        try {
            int x = 5 / 0;
        }
        catch(ArithmeticException e) {
            e.printStackTrace();
        }
    }



    static void number() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("GEben Sie bitte eine Zahl ein");
        String word=scanner.nextLine();
        try {
            int n=Integer.parseInt(word);
            System.out.println(n);
        }
        catch (NumberFormatException e) {
            System.out.println("Keine Ungultige Zahl");
        }
        finally {
            System.out.println("Ich bin dabei");
        }
    }
}
