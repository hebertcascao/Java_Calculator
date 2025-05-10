package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero:");
        double num1 = scanner.nextDouble();

        System.out.println("Digite o operador (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Digite o segundo numero:");
        double num2 = scanner.nextDouble();

        double result;

        try{
            switch (operator){
                case '+':
                    result = calculator.add(num1,num2);
                    break;
                case '-':
                    result = calculator.subtract(num1,num2);
                    break;
                case '*':
                    result = calculator.multiply(num1,num2);
                    break;
                case '/':
                    result = calculator.divide(num1,num2);
                    break;
                default:
                    System.out.println("Operador inválido!");
                    return;
            }
            System.out.println("O Resultado da operação é: "  + result);

        }catch(ArithmeticException e){
            System.out.println("Erro:" + e.getMessage());
        }
        scanner.close();
    }
}
