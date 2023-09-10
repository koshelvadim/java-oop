package home4;

public class Teacher extends User{
    private String objectToTeach;
    private int rating;


    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getObjectToTeach() {
        return objectToTeach;
    }

    public void setObjectToTeach(String objectToTeach) {
        this.objectToTeach = objectToTeach;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "objectToTeach='" + objectToTeach + '\'' +
                ", rating=" + rating +
                '}';
    }

    public Teacher(String name, String objectToTeach, int rating) {
        super(name);
        this.objectToTeach = objectToTeach;
        this.rating = rating;
    }

    public Teacher(String name) {
        super(name);
    }
}
