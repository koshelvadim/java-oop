package home5.calculator;

import java.util.List;

public interface NumberInter {
    public List<ComplexNumber> getAllComplexNumbers();
    public void createCoupleComplexNumbers();
    public ComplexNumber addition(ComplexNumber x,ComplexNumber y);
    public ComplexNumber subtraction(ComplexNumber x, ComplexNumber y);
    public ComplexNumber multiplication(ComplexNumber x,ComplexNumber y);
    public ComplexNumber division(ComplexNumber x,ComplexNumber y);
}
