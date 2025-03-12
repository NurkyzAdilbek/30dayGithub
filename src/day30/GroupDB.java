package day30;

import java.util.ArrayList;
import java.util.List;

public class GroupDB {
    List<Group> groups = new ArrayList<Group>();
    List<Student>students=new ArrayList<>();

public  void addStudent(Group group,Student student) {
    group.setStudents((List<Student>) student);

}


}
