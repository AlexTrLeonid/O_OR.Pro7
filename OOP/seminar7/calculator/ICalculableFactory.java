package OOP.seminar7.calculator;

import OOP.seminar7.complex.Complex;

public interface ICalculableFactory {
    Calculable create(Complex firstArg);
}
