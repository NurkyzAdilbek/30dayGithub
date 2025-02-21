package day11;

public class Student implements Methods {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        if (age<0){
            System.out.println(" Age can not to be negative ");
        }
        return age;
    }

    @Override
    public String uniName(Student s, String uni) {
        return uni;
    }


}

 interface Methods{
    public String getName();
    public int getAge();
    String uniName(Student s, String uni);
}
