package TesteCalc;

import java.util.Scanner;

public class CalculadoraTeste {

    // Método para calcular com 2 valores
    public double calcular(double a, double b, char operador) {
        switch (operador) {
            case '+': 
                return a + b;
            case '-': 
                return a - b;
            case '*': 
                return a * b;
            case '/': 
                if (b == 0) {
                    throw new ArithmeticException("Divisão por zero não permitida.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }

    public double calcular(double a, double b, double c, char operador) {
        double parcial = calcular(a, b, operador);
        return calcular(parcial, c, operador);
    }
}
