package main;


public class Calculator {
    public double add(double num1, double num2){
        return num1 + num2;
    }

    public double subtract(double num1, double num2){
        return num1 - num2;
    }

    public double multiply(double num1, double num2){
        return num1 * num2;
    }

    public double divide(double num1, double num2) throws ArithmeticException {
        if(num2 == 0){
            System.out.println("Divisão por zero não é permitida");
        }
        return  num1 / num2;
    }
}