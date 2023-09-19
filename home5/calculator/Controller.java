package home5.calculator;

import java.util.List;

public class Controller {

    NumberService numberService = new NumberService();
    UserView userView = new UserView();

    public void start() {
        numberService.createCoupleComplexNumbers();
        workWithComplexNumbers(numberService.getAllComplexNumbers());
    }

    private void workWithComplexNumbers(List<ComplexNumber> allComplexNumbers) {
        userView.set();
        userView.appendLog(numberService.getAllComplexNumbers());
        int answer = userView.get();
        List<ComplexNumber> list = numberService.getAllComplexNumbers();
        ComplexNumber complexNumber;
        switch (answer) {
            case 1:
                complexNumber = numberService.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" addition Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 2:
                complexNumber = numberService.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 3:
                complexNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" multiplication Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 0:
                return;
            default:
                workWithComplexNumbers(numberService.getAllComplexNumbers());
        }


    }
}
