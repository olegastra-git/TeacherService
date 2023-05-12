package TeacherService;

import java.util.ArrayList;
import java.util.List;

import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.UserComparator;

public class TeacherGroupService {

    private List<StudentGroup> groups;

    public TeacherGroupService() {
        this.groups = new ArrayList<>();
    }

    public List<StudentGroup> getAll() {
        return this.groups;
    }

    public List<Student> getSortedByFIOStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<Student>());
        return students;
    }
}
