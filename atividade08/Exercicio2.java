import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        Scanner scanner = new Scanner(System.in);

        int i = 0;
        boolean flag = true;

        while (flag) {
            try {
                System.out.print("Digite um valor inteiro (ou 0 para sair): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    flag = false;
                } else {
                    vetor[i] = valor;
                    i++;
                    if (i == 10) {
                        flag = false;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Valor informado não é numérico.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: Limite máximo de valores atingido.");
                flag = false;
            }
        }

        scanner.close();

        System.out.println("\nDados do vetor: ");

        for (int i=0; i<i; i++) {
            System.out.println(vetor[i]+" ");
        }
    }
}