package home4;

import javax.swing.plaf.LabelUI;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        Teacher teacher1 = new Teacher("John","math", 5);
//        Teacher teacher2 = new Teacher("Anna","biology", 3);
//        Teacher teacher3 = new Teacher("Max", "geometry", 4);

//        List<Teacher> list = new ArrayList<>();
//        list.add(teacher1);
//        list.add(teacher2);
//        list.add(teacher3);
//        System.out.println(list);
//        list.sort(new TeacherComparator());
//        System.out.println(list);


        StudentService studentService = new StudentService();
        studentService.create("Student1",14,21);
        studentService.create("Student2",10,12);
        studentService.create("Student3",17,19);
        System.out.println(studentService.getAll());

        TeacherService teacherService = new TeacherService();
        teacherService.create("teacher1",10, 29);
        teacherService.create("teacher2",8, 37);

        System.out.println(teacherService.getAll());



    }
}
