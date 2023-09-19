package home5.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberService implements NumberInter {
    private List<ComplexNumber> complexNumbers;
    public NumberService() {
        this.complexNumbers = new ArrayList<>();
    }

    public List<ComplexNumber> getAllComplexNumbers() {
        return complexNumbers;
    }

    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа:");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа:");
        y = scanner.nextDouble();
        ComplexNumber complexNumber1 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа:");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа:");
        y = scanner.nextDouble();
        ComplexNumber complexNumber2 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber2);
    }

    @Override
    public ComplexNumber addition(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setNumerator(x.getNumerator() + y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() + y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setNumerator(x.getNumerator() - y.getNumerator());
        z.setImaginaryPart(x.getImaginaryPart() - y.getImaginaryPart());
        return z;
    }

    @Override
    public ComplexNumber multiplication(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setNumerator((x.getNumerator() * y.getNumerator()) -
                (x.getImaginaryPart() * y.getImaginaryPart()));
        z.setImaginaryPart((x.getImaginaryPart() * y.getNumerator()) +
                (x.getNumerator() * y.getImaginaryPart()));
        return z;
    }

    @Override
    public ComplexNumber division(ComplexNumber x, ComplexNumber y) {
        ComplexNumber z = new ComplexNumber(0.0,0.0);
        z.setNumerator(((x.getNumerator() * y.getNumerator()) +
                (x.getImaginaryPart() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart()* y.getImaginaryPart())));
        z.setImaginaryPart((((x.getImaginaryPart() * y.getNumerator()) -
                (x.getNumerator() * y.getImaginaryPart())) /
                ((y.getNumerator() * y.getNumerator()) + (y.getImaginaryPart()* y.getImaginaryPart()))));
        return z;
    }
}
