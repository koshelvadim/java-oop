package home2;

public class Wall implements Equipment {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void equip(God god) {
        god.jump(height);
    }
}
