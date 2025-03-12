package day30;

import java.util.List;

public class DataBaseTeacher {
    List< Teacher>teacherList;
    Teacher teacher;

    public void add(Teacher techer){
        teacherList.add(techer);
    }
    public void delete(Teacher techer){
        teacherList.remove(techer);

    }
    public List< Teacher>getTeacherList(){
        return teacherList;
    }
    public void addStudent(Teacher teacher,Student student){
        teacher.setStudents((List<Student>) student);


    }
}
