package seminar3_3;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int maxTry = 3;
        int sizeWord = 3;

        MenuGame.printGameMenu();
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if(Objects.equals(number, "1")) {
            Game game = new GameNumber();

            game.start(sizeWord,maxTry);
            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    &&!game.getGameStatus().equals(GameStatus.LOSE)){
                System.out.println("Ваш ход: ");
                String value = scanner.nextLine();
                Answer answer = game.inputValue(value);
                System.out.println("answer = " + answer);
            }
            System.out.println(game.getGameStatus());
        }
        if(Objects.equals(number, "2")) {
            Game game = new EnGame();

            game.start(sizeWord,maxTry);
            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    &&!game.getGameStatus().equals(GameStatus.LOSE)){
                System.out.println("Ваш ход: ");
                String value = scanner.nextLine();
                Answer answer = game.inputValue(value);
                System.out.println("answer = " + answer);
            }
            System.out.println(game.getGameStatus());
        }
        if(Objects.equals(number, "3")) {
            Game game = new RuGame();

            game.start(sizeWord,maxTry);
            while (!game.getGameStatus().equals(GameStatus.WINNER)
                    &&!game.getGameStatus().equals(GameStatus.LOSE)){
                System.out.println("Ваш ход: ");
                String value = scanner.nextLine();
                Answer answer = game.inputValue(value);
                System.out.println("answer = " + answer);
            }
            System.out.println(game.getGameStatus());
        }
    }
}
