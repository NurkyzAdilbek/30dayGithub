package day30;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private ProgLanguage progLanguage;
    public Student(String name, int age, Gender gender, ProgLanguage progLanguage) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.progLanguage = progLanguage;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public ProgLanguage getProgLanguage() {
        return progLanguage;
    }

    public void setProgLanguage(ProgLanguage progLanguage) {
        this.progLanguage = progLanguage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", progLanguage=" + progLanguage +
                '}';
    }
}
