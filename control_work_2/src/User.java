package control_work_2.src;

/**
 * Класс участника, с автоинкрементом id
 */
public class User implements Comparable<User>{
    String name;
    int id;
    static int totalCount = 0;

    public User(String name) {
        this.name = name;
        this.id = totalCount++;
    }

    @Override
    public String toString() {
        return String.format("Участник номер %d, %s - ", this.id,this.name);
    }

    @Override
    public int compareTo(User o) {
        if(o.id == this.id){
            return 0;
        }
        return this.id < o.id ? -1 : 1;
    }
}
