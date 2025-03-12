package day30;

import java.util.List;

public class Teacher {
    private String name;
    private Long phoneNumber;
    List<Student> students;
    private Group group;

    public Teacher(String name, Long phoneNumber, List<Student> students, Group group) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.students = students;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Techer{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", students=" + students +
                ", group=" + group +
                '}';
    }
}
