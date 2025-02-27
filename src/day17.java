import java.util.LinkedList;

public class day17 {
    public static void main(String[] args) {
        LinkedList<String>names=new LinkedList<>();
        names.add("Mike");
        names.add("John");
        names.add("Jane");
        names.add("Bob");
        names.add("Jack");
        names.remove();
        System.out.println(names.size());
    }
}
