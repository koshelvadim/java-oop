package home4;

public class User {
    private String name;

    public int getScore(){
        if(this instanceof Student) {
            return getScore();
        } else {
            return 0;
        }
    }
    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
