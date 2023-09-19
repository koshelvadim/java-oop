package home7.calculator;

public interface ICalculableFactory {
    Calculable create(int primaryArg, boolean logFlag);
}
