package test;

import main.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorFunctionalTest {
    Calculator calc = new Calculator();

    @Test
    void testCombinedOperationFlows(){
        double result = calc.add(3, 6);
        result = calc.multiply(result, 2);
        result = calc.divide(result, 3);
        result = calc.subtract(result,2);

        Assertions.assertEquals(4.0, result);
    }

    @Test
    void testCombinedOperationWithDivideZeroFlows(){
        double result = calc.add(4, 3);
        result = calc.multiply(result, 3);
        result = calc.divide(result, 7);
        result = calc.subtract(result,2);

        double finalResult = result;

        assertThrows(ArithmeticException.class, () -> calc.divide(finalResult,0));
    }
}
