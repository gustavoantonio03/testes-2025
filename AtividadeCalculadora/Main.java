import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Digite o raio da circunferência:");
        Scanner scanner = new Scanner(System.in);
        double raio = scanner.nextDouble();
        scanner.close();

        double resultado = Calculadora.circunferencia(raio);
        System.out.printf("O valor da circunferência é: %.2f\n", resultado);
    }
}