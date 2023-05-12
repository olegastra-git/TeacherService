package Controllers;

import StudentDomen.User;
import TeacherDomen.Teacher;
import TeacherService.TeacherGroupService;
import TeacherService.TeacherService;

public class TeacherController implements iUserController<User> {

    private final TeacherService dataService = new TeacherService();
    private final TeacherGroupService groupService = new TeacherGroupService();

    @Override
    public void create(String firstName, String secondName, int age) {
        dataService.create(firstName, secondName, age);
    }

}
