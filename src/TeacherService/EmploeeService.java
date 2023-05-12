package TeacherService;

public class EmploeeService implements Comparable<EmploeeService> {
    private String firstName;
    private String secondName;
    private int age;
    private int count;
    private int group;

    public EmploeeService(String firstName, String secondName, int age, int count, int group) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.count = count;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public int getCount() {
        return count;
    }

    public int getGroup() {
        return group;
    }

    @Override
    public int compareTo(EmploeeService o) {
        // Сравниваем сначала фамилии, потом имя и возраст.
        int cmp = this.secondName.compareTo(o.secondName);
        if (cmp != 0) {
            return cmp;
        }
        cmp = this.firstName.compareTo(o.firstName);
        if (cmp != 0) {
            return cmp;
        }
        return this.age - o.age;
    }
}