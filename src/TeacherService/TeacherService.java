package TeacherService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import TeacherDomen.Teacher;

public class TeacherService implements iUserService<Student> {
    private static final List<Teacher> Teacher = null;
    private int count;
    private List<Student> students;

    public TeacherService() {
        new ArrayList<Teacher>();
    }

    @Override
    public void create(String firstName, String secondName, int age) {
        Student per = new Student(firstName, secondName, age, count);
        count++;
        students.add(per);
    }

    @Override
    public List<Teacher> getAll() {
        return (List<TeacherDomen.Teacher>) Teacher;
    }
}
