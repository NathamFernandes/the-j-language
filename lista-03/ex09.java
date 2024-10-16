import java.util.Scanner;

/**
 * 9. Leia uma matriz de 3 x 3 elementos. Calcule a soma dos elementos que estão
 * na diagonal principal.
 */

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz[][] = new int[3][3];
        int soma = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = scanner.nextInt();
                if (j == i)
                    soma += matriz[i][j];
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }

            System.out.printf("\n");
        }

        System.out.println("Soma: " + soma);

        scanner.close();
    }

}
