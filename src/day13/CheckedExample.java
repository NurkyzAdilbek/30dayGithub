package day13;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("C:\\Users\\adilb\\IdeaProjects\\KlaususrVorberitung\\src\\exceptions\\test.txt"); // Файл табылбаса, ката чыгат
            System.out.println(file);
        } catch (FileNotFoundException e) {
            System.out.println("Файл табылган жок!");
        }



    }
}
