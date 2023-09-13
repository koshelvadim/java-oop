package home5.calculator;

import java.util.List;

public class Controller {

    NumberService numberService = new NumberService();
    UserView userView = new UserView();

    public void start() {
        userView.set();
        int answer = userView.get();


        switch (answer){
            case 1:
                numberService.createCoupleComplexNumbers();
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                userView.appendLog("workWithComplexNumbers");
                break;
            case 2:
                numberService.createCoupleRationalNumbers();
                workWithRationalNumbers(numberService.getallRationalNumbers());
                userView.appendLog("workWithRationalNumbers");
                break;
            case 0:
                return;

            default:start();
        }
    }

    private void workWithRationalNumbers(List<RationalNumber> rationalNumbers) {
        userView.set1();
        userView.appendLog(numberService.getallRationalNumbers());
        int answer = userView.get();
        List<RationalNumber> list = numberService.getallRationalNumbers();
        RationalNumber rationalNumber;
        switch (answer) {
            case 1:
                rationalNumber = numberService.addition(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" addition Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 2:
                rationalNumber = numberService.subtraction(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 3:
                rationalNumber = numberService.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" subtraction Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 4:
                rationalNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" multiplication Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 5:
                rationalNumber = numberService.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 6:
                rationalNumber = numberService.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + rationalNumber);
                userView.appendLog(" division Ответ:" + rationalNumber.toString());
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 7:
                System.out.println(userView.log);
                workWithRationalNumbers(numberService.getallRationalNumbers());
                break;
            case 8:
                start();
                break;
            case 0:
                return;
            default:
                workWithRationalNumbers(numberService.getallRationalNumbers());
        }
    }

    private void workWithComplexNumbers(List<ComplexNumber> allComplexNumbers) {
        userView.set1();
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
                complexNumber = numberService.subtraction(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" subtraction Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 4:
                complexNumber = numberService.multiplication(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" multiplication Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 5:
                complexNumber = numberService.division(list.get(list.size() - 2), list.get(list.size() - 1));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 6:
                complexNumber = numberService.division(list.get(list.size() - 1), list.get(list.size() - 2));
                System.out.println("Ответ:" + complexNumber);
                userView.appendLog(" division Ответ:" + complexNumber.toString());
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 7:
                System.out.println(userView.log);
                workWithComplexNumbers(numberService.getAllComplexNumbers());
                break;
            case 8:
                start();
                break;
            case 0:
                return;
            default:
                workWithComplexNumbers(numberService.getAllComplexNumbers());
        }


    }
}
