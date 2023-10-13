package control_work_2.src;

import java.util.List;


public class Main {
    public static void main(String[] args) {
        //инициализация списка игрушек из файла toylist.txt
        ToyList toys1 = new ToyList();
        System.out.println(toys1);
        //инициализация очереди 10 участников
        UserQueue pq = new UserQueue(List.of(
                new User("Женя"),
                new User("Петя"),
                new User("Света"),
                new User("Галя"),
                new User("Коля"),
                new User("Вася"),
                new User("Данила"),
                new User("Денис"),
                new User("Катя"),
                new User("Оля")
        ));
        //сам розыгрыш
        System.out.println("\nРозыгрыш с вероятностью проиграть 30%\n");
        Game raf = new Game(pq,toys1);
        raf.setLossWeight(30);
        System.out.println(raf.currentToys.toString());
        raf.runGame();

        //Запись состояния призов в файл для склада
        toys1.saveToFile();
    }
}
