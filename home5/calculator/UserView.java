package home5.calculator;

import java.util.List;
import java.util.Scanner;

public class UserView implements View {
    public String log = "";
    Scanner in = new Scanner(System.in);

    public int get() {
        return in.nextInt();
    };

    @Override
    public void set() {
        System.out.println("1 - Комплкесные числа\n" +
                "2 - рациональные числа\n" +
                "0 - выход");
        System.out.print("Выберете числа: ");

    }



    @Override
    public void set1() {
        System.out.println("1 - сложить числа\n" +
                "2 - вычесть первое число из второго\n" +
                "3 - вычесть второе число из первого\n" +
                "4 - перемножить числа\n" +
                "5 - разделить первое число на второе\n" +
                "6 - разделить второе число на первое\n" +
                "7 - показать все введённые числа и ответы\n" +
                "8 - ввести новые числа\n" +
                "0 - выход");
        System.out.print("Выберете функцию: ");
    }

    @Override
    public void appendLog(String log) {
        this.log += log + "\n";
    }
    public void appendLog(List list){
        this.log += list.get(list.size()-2).toString()+ " " + list.get(list.size()-1).toString();
    }

    @Override
    public void showLog() {
        System.out.println(this.log);
    }

}
