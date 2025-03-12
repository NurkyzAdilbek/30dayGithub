package day30;

import java.util.List;

public class StudentMain {
    public static void main(String[] args) {


        DataBaseStudent dataBaseStudent=new DataBaseStudent();
        Student student1 = new Student("Alice", 22, Gender.FEMALE, ProgLanguage.JAVA);
        Student student2 = new Student("Bob", 24, Gender.MALE, ProgLanguage.PYTHON);
        Student student3 = new Student("Charlie", 21, Gender.MALE, ProgLanguage.JAVASCRIPT);
        Student student4 = new Student("Diana", 23, Gender.FEMALE, ProgLanguage.JAVA);
        Student student5 = new Student("Ethan", 25, Gender.MALE, ProgLanguage.PYTHON);
        Student student6 = new Student("Fiona", 22, Gender.FEMALE, ProgLanguage.JAVASCRIPT);
        Student student7 = new Student("George", 26, Gender.MALE, ProgLanguage.JAVA);
        Student student8 = new Student("Hannah", 24, Gender.FEMALE, ProgLanguage.PYTHON);
        Student student9 = new Student("Ian", 23, Gender.MALE, ProgLanguage.JAVASCRIPT);
        Student student10 = new Student("Julia", 22, Gender.FEMALE, ProgLanguage.JAVA);
dataBaseStudent.add(student1);
dataBaseStudent.add(student2);
dataBaseStudent.add(student3);
dataBaseStudent.add(student4);
dataBaseStudent.add(student5);
dataBaseStudent.add(student6);
dataBaseStudent.add(student7);
dataBaseStudent.add(student8);
dataBaseStudent.add(student9);
dataBaseStudent.add(student10);
GroupDB groupDB=new GroupDB();
        Group group=new Group("A");
        Group group1=new Group("B" );
        Group group2=new Group("C");
        Group group3=new Group("D" );
        groupDB.addStudent(group,student1);
        groupDB.addStudent(group,student2);
        groupDB.addStudent(group,student3);
        groupDB.addStudent(group,student4);

        DataBaseTeacher dataBaseTeacher=new DataBaseTeacher();
        Teacher teacher1 = new Teacher("Mr. Smith", 1234567890L, List.of(student1, student2, student3), group);
        Teacher teacher2 = new Teacher("Ms. Johnson", 9876543210L, List.of(student4, student5, student6), group1);
        Teacher teacher3 = new Teacher("Dr. Brown", 1122334455L, List.of(student7, student8), group2);
        Teacher teacher4 = new Teacher("Prof. White", 5566778899L, List.of(student9, student10),group3);

        group.setTeacher(teacher1);
        group1.setTeacher(teacher2);
        group2.setTeacher(teacher3);
        group3.setTeacher(teacher4);




    }
}
