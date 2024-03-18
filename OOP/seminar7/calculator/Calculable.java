package OOP.seminar7.calculator;

import OOP.seminar7.complex.Complex;

public interface Calculable {
    Calculable sum(Complex arg);
    Calculable multi(Complex arg);
    Calculable div(Complex arg);
    Calculable minus(Complex arg);
    Complex getResult();
}
