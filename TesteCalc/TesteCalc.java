package TesteCalc;

import java.util.Scanner;

public class TesteCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculadoraTeste calc = new CalculadoraTeste();

        System.out.println("=== CALCULADORA ===");
        System.out.print("Digite a quantidade de valores (2 ou 3): ");
        int qtd = sc.nextInt();

        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        double resultado = 0;
        char operador;

        System.out.print("Digite a operação (+, -, *, /): ");
        operador = sc.next().charAt(0);

        if (qtd == 2) {
            resultado = calc.calcular(a, b, operador);
        } else if (qtd == 3) {
            System.out.print("Digite o terceiro número: ");
            double c = sc.nextDouble();
            resultado = calc.calcular(a, b, c, operador);
        } else {
            System.out.println("Quantidade inválida! Use 2 ou 3.");
            sc.close();
            return;
        }

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
