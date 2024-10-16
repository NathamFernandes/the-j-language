import java.util.Scanner;

/**
 * Desenvolva um algoritmo que leia um número inteiro positivo ‘n’ e em seguida
 * imprima ‘n’ linhas do chamado Triangulo de Pascal
 */

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linhas = scanner.nextInt();
        int matriz[][] = new int[linhas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < i + 1; j++) {
                if ((j == 0 && i == 0) || (j == 0 || j == i)) {
                    matriz[i][j] = 1;
                    continue;
                }

                matriz[i][j] = matriz[i - 1][j - 1] + matriz[i - 1][j];
            }
        }

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < linhas; j++) {
                int number = matriz[i][j];
                if (number == 0) {
                    System.out.printf(" ");
                } else {
                    System.out.printf("%d ", matriz[i][j]);
                }
            }

            System.out.println("");
        }

        scanner.close();
    }
}
