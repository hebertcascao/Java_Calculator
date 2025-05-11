package test;

import main.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorUnitTest {
    Calculator calc = new Calculator();

    /* Testes unitários da Função add*/
    @Test
    void testAddPositiveNumbers(){
        double resultAdd = calc.add(10,40);
        Assertions.assertEquals(50, resultAdd);
    }

    @Test
    void testAddNegativeNumbers(){
        double resultAdd = calc.add(-40, -7);
        Assertions.assertEquals(-47, resultAdd);
    }

    @Test
    void testAddWithZero(){
        double resultAdd = calc.add(0, 15);
        Assertions.assertEquals(15, resultAdd);
    }

    /* Testes unitários da Função subtract*/
    @Test
    void testSubtractPositiveNumbers(){
        double resultSubtract = calc.subtract(54,24);
        Assertions.assertEquals(30, resultSubtract);
    }

    @Test
    void testSubtractNegativeNumbers(){
        double resultSubtract = calc.subtract(-40, -7);
        Assertions.assertEquals(-33, resultSubtract);
    }

    @Test
    void testSubtractWithZero(){
        double resultSubtract = calc.subtract(87, 0);
        Assertions.assertEquals(87, resultSubtract);
    }

    /* Testes unitários da Função multiply*/
    @Test
    void testMultiplyPositiveNumbers(){
        double resultMultiply = calc.multiply(2,50);
        Assertions.assertEquals(100, resultMultiply);
    }

    @Test
    void testMultiplyNegativeNumbers(){
        double resultMultiply = calc.multiply(-15, -3);
        Assertions.assertEquals(45, resultMultiply);
    }

    @Test
    void testMultiplyWithZero(){
        double resultMultiply = calc.multiply(32, 0);
        Assertions.assertEquals(0, resultMultiply);
    }

    /* Testes unitários da Função divide*/
    @Test
    void testDividePositiveNumbers(){
        double resultDivide = calc.divide(90, 3);
        Assertions.assertEquals(30, resultDivide);
    }

    @Test
    void testDivideNegativeNumbers(){
        double resultDivide = calc.divide(-10, -2);
        Assertions.assertEquals(5, resultDivide);
    }

    @Test
    void testDivideDividendIsZero(){
        double resultDivide = calc.divide(0, 8);
        Assertions.assertEquals(0, resultDivide);
    }

    @Test
    void testDivideDivisorIsZero(){
        assertThrows(ArithmeticException.class, () -> calc.divide(4,0));
    }

}
