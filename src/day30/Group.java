package day30;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private Teacher teacher;
    List<Student> students=new ArrayList<>();

    public Group(String name, Teacher teacher, List<Student> students) {
        this.name = name;
        this.teacher = teacher;
        this.students = students;
    }

    public Group(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", teacher='" + teacher + '\'' +
                ", students=" + students +
                '}';
    }
}
