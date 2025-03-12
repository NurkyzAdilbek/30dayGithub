package day30;

import java.util.ArrayList;
import java.util.List;

public class DataBaseStudent {
    List<Student> students = new ArrayList<Student>();

    public void add(Student student){
        students.add(student);
    }
    public List<Student> getStudents(){
        return students;
    }
    public Student removeStudent(Student student){
        students.remove(student);
        return student;

    }
    public Student getStudent(int index){
        return students.get(index);
    }

}
