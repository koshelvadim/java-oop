package home4;

import java.util.List;

public class TeacherView<T extends Teacher> implements UserView<T> {
    public void sendOnConsole (List<T> teacher) {
        for(T user: teacher) {
            System.out.println(user);
        }
    }
}
