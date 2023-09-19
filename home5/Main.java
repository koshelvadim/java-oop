package home5;

import home5.calculator.Controller;

public class Main {
    public static void main(String[] args) {
        System.out.println("Калькулятор комплексных чисел: \n");
        Controller controller = new Controller();
        controller.start();
    }
}
