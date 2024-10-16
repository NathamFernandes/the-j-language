import java.util.Scanner;

/**
 * 1 - Desenvolva um algoritmo que receba o tamanho de um vetor [N] e uma
 * sequência numérica do usuário. Em seguida o algoritmo deverá imprimir a
 * sequência de forma invertida.
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int vetor[] = new int[n];
        // int number;

        for (int i = n - 1; i >= 0; i--) {
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.printf("%d ", vetor[i]);
        }

        scanner.close();
    }
}