package home5.calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumberService implements NumberInter {
    private List<ComplexNumber> complexNumbers;
    private List<RationalNumber> rationalNumbers;
    public NumberService() {
        this.complexNumbers = new ArrayList<>();
        this.rationalNumbers = new ArrayList<>();
    }


    public List<ComplexNumber> getAllComplexNumbers() {
        return complexNumbers;
    }

    @Override
    public List<RationalNumber> getallRationalNumbers() {
        return rationalNumbers;
    }

    @Override
    public void createCoupleComplexNumbers() {
        Scanner scanner = new Scanner(System.in);
        double x;
        double y;
        System.out.println("Введите действительную часть первого числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть первого числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber1 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber1);
        System.out.println("Введите действительную часть второго числа");
        x = scanner.nextDouble();
        System.out.println("Введите мнимую часть второго числа");
        y = scanner.nextDouble();
        ComplexNumber complexNumber2 = new ComplexNumber(x, y);
        complexNumbers.add(complexNumber2);
    }

    @Override
    public void createCoupleRationalNumbers() {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;
        List<RationalNumber> list = new ArrayList<>();
        System.out.println("Введите числитель первого числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель первого числа");
        y = scanner.nextInt();
        RationalNumber rationalNumber1 = new RationalNumber(x,y);
        rationalNumbers.add(rationalNumber1);
        System.out.println("Введите числитель второго числа");
        x = scanner.nextInt();
        System.out.println("Введите знаменатель второго числа");
        y = scanner.nextInt();
        RationalNumber rationalNumber2 = new RationalNumber(x, y);
        rationalNumbers.add(rationalNumber2);
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
    @Override
    public RationalNumber addition(RationalNumber x, RationalNumber y) {
        return x;
    }

    @Override
    public RationalNumber subtraction(RationalNumber x, RationalNumber y) {
        return x;
    }

    @Override
    public RationalNumber multiplication(RationalNumber x, RationalNumber y) {
        return x;
    }

    @Override
    public RationalNumber division(RationalNumber x, RationalNumber y) {
        return x;
    }

}
