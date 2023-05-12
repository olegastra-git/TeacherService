import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.EmploeeController;
import StudentDomen.Emploee;
import StudentDomen.Student;
import StudentDomen.StudentGroup;
import StudentDomen.Teacher;
import StudentDomen.User;

public class App {
    public static void main(String[] args) throws Exception {
        User u1 = new User("Ivan", "Ivanov", 25);
        Student s1 = new Student("Segey", "Ivashkin", 22, (long) 101);
        Student s2 = new Student("Andrey", "Sidorov", 22, (long) 111);
        Student s3 = new Student("Vanya", "Petrov", 22, (long) 121);
        Student s4 = new Student("Ilya", "Antonov", 23, (long) 301);
        Student s5 = new Student("Darya", "cvetkova", 23, (long) 171);
        Student s6 = new Student("Lena", "Lilina", 23, (long) 104);
        Teacher t1 = new Teacher("Sergo", "Shmatko", 25, 0, null);
        List<Student> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);
        listStud.add(s4);
        listStud.add(s5);
        listStud.add(s6);
        List<Teacher> listTeac = new ArrayList<>();
        listTeac.add(t1);

        StudentGroup group = new StudentGroup(listStud);

        for (Student stud : group) {
            System.out.println(stud);
        }

        System.out.println("============= Posle Sortirovki =============");
        Collections.sort(group.getStudents());

        for (Student stud : group) {
            System.out.println(stud);
        }

        Emploee person1 = new Emploee("Ivanov", "Oleg", 55, 110);
        EmploeeController.paySalary(person1);
        EmploeeController.paySalary(s1);

        Integer studHour[] = { 124, 234, 231, 1, 45 };
        System.out.println(EmploeeController.mean(studHour));

        Double emplSalary[] = { 12555.23, 34213.5, 10000.0 };
        System.out.println(EmploeeController.mean(emplSalary));
        System.out.println(t1);
        System.out.println(u1);
        System.out.println(s1);
        System.out.println(group);
    }
}