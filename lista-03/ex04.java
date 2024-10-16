import java.util.Scanner;

/**
 * 4. Desenvolva um algoritmo que consiga realizar a multiplicação de matrizes,
 * com os tamanhos 2 x 3 e 3 X 2. Os números devem ser fornecidos pelo usuário.
 */

public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz1[][] = new int[2][3];
        int matriz2[][] = new int[3][2];
        int matrizResultante[][] = new int[2][2];

        System.out.println("Números da matriz 1 (2x3): ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                matriz1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Números da matriz 2 (3x2): ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                matriz2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 2; i++) {
            int result = 0;

            for (int j = 0; j < 3; j++) {
                result += (matriz1[0][j] * matriz2[j][i]);
            }
            matrizResultante[0][i] = result;
        }

        for (int i = 0; i < 2; i++) {
            int result = 0;

            for (int j = 0; j < 3; j++) {
                result += (matriz1[1][j] * matriz2[j][i]);
            }
            matrizResultante[1][i] = result;
        }

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("%d ", matrizResultante[i][j]);
            }
        }

        scanner.close();

    }
}
