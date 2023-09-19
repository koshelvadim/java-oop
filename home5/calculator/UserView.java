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
        System.out.println("1 - сложить числа\n" +
                "2 - вычесть первое число из второго\n" +
                "3 - перемножить числа\n" +
                "0 - выход");
        System.out.print("Выберете действие: ");
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
