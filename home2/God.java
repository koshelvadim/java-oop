package home2;

public abstract class God implements Action {
    public String name;


    public abstract void run(int distance);
    public abstract void jump(int height);

    public God(String name) {
        this.name = name;
    }

}
