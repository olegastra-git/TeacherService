package TeacherDomen;

import java.util.Iterator;
import java.util.List;

public class TeacherGroupIterator implements Iterator<Teacher> {
    private int counter;
    private final List<Teacher> students;

    public TeacherGroupIterator(List<Teacher> teachers) {
        this.counter = 0;
        this.students = teachers;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Teacher next() {
        if (!hasNext()) {
            return null;
        }
        return students.get(counter++);
    }
}