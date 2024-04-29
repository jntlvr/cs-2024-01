import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            int numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            int numero2 = scanner.nextDouble();

            int resultado = numero/numero2;
            System.out.println("O resultado da divisão é " + resultado);

        } catch (InputMismatchException e) {
            System.out.println("Erro: O valor informado não é numérico.");

        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero.");
        }

        scanner.close();
    }
}