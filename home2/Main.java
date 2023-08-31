package home2;

// https://github.com/sergeiavdeev/java-core-2/blob/master/src/main/java/lesson1/Bot.java

public class Main {
    public static void main(String[] args) {

        God[] gods = {
                new Human("John", 1500, 10),
                new Cat("Barsik", 500, 1),
                new Robot("Robo", 2000, 20)
        };

        for (God god : gods) System.out.println(god.toString());

        Equipment[] equipments = {
                new Wall(5),
                new Treadmill(1000),
                new Wall(15),
                new Treadmill(2000)
        };

        for (God god : gods) {
            for (Equipment equipment : equipments) {
                equipment.equip(god);
            }
        }


    }
}
