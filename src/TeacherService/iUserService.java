package TeacherService;

import java.util.List;

import TeacherDomen.Teacher;

public interface iUserService<T> {
    List<Teacher> getAll();

    void create(String firstName, String secondName, int age);
}
