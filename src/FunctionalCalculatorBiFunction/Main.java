package FunctionalCalculatorBiFunction;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        int a=10;
        int b=5;

        BiFunction<Integer, Integer, Integer> Addition=(num1,num2)->a+b;
        BiFunction<Integer, Integer, Integer> Subtraction=(num1,num2)->a-b;
        BiFunction<Integer, Integer, Integer> Multiplication=(num1,num2)->a*b;
        BiFunction<Integer, Integer, Integer> Division = (num1, num2) -> {
            if (num2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return num1 / num2;
        };

        int result = FunctionalCalculator.calculate(a,b,Addition);
        int result2 =FunctionalCalculator.calculate(a,b,Subtraction);
        int result3 =FunctionalCalculator.calculate(a,b,Multiplication);
        int result4 =FunctionalCalculator.calculate(a,b,Division);

        System.out.println("Addition: " +a+ " + "+b + " ="+ result);
        System.out.println("Subtraction: " +a+ " - "+b + " ="+ result2);
        System.out.println("Multiplication: " +a+ " * "+b + " ="+ result3);
        System.out.println("Division: " +a+ " / "+b + " ="+ result4);


    }
}
