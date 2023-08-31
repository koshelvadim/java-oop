package home2;

public class Treadmill implements Equipment {

    private int distance;

    public Treadmill(int distance) {
        this.distance = distance;
    }


    @Override
    public void equip(God god) {
        god.run(distance);
    }
}
