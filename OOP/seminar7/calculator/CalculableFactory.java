package OOP.seminar7.calculator;

import OOP.seminar7.complex.Complex;

public class CalculableFactory implements ICalculableFactory{
    @Override
    public Calculable create(Complex firstArg) {
        return new Calculator(firstArg);
    }
}
