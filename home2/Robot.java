package home2;

public class Robot extends NotAlive implements Action{

    public int maxDistance;
    public int maxHeight;
    public boolean isActive;
    public Robot(String name, int maxDistance, int maxHeight) {
        super(name);
        this.maxDistance = maxDistance;
        this.maxHeight = maxHeight;
        isActive = true;
    }

    public String toString() {
        return String.format("name: %s, distance: %d" + "m, height: %d" + "m;", this.name, maxDistance, maxHeight);
    }

    @Override
    public void run(int distance) {
        if (maxDistance < distance) isActive = false;
        if (isActive) System.out.printf("%s run %d" + "m\n", super.name, distance);
    }

    @Override
    public void jump(int height){
        if (maxHeight < height) isActive = false;
        if (isActive) System.out.printf("%s jump %d" + "m\n", super.name, height);
    }
}
