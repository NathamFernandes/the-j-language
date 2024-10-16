import java.util.Scanner;

/**
 * Desenvolva um algoritmo que receba uma sequência de 10 números e imprima-os
 * de ordem decrescente.
 */

public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vetor[] = new int[10];
        boolean swap;
        int aux;

        for (int i = 0; i < 10; i++) {
            vetor[i] = scanner.nextInt();
        }

        for (int j = 0; j < 10; j++) {
            swap = false;

            for (int k = 0; k < 9; k++) {
                if (vetor[k] > vetor[k + 1]) {
                    aux = vetor[k];
                    vetor[k] = vetor[k + 1];
                    vetor[k + 1] = aux;
                    swap = true;
                }
            }

            if (swap == false)
                break;
        }

        for (int i = 0; i < 10; i++) {
            System.out.printf("%d ", vetor[i]);
        }

        scanner.close();
    }
}