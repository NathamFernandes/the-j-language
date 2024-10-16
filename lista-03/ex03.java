import java.util.Scanner;

/**
 * 3. Desenvolva um algoritmo que declare, preencha e, ao final, imprima uma
 * matriz (5×5) com valores fornecidos pelo usuário. O programa deve imprimir o
 * maior valor da matriz e em qual posição (linha e coluna) este valor está.
 */

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matriz[][] = new int[5][5];
        int posI = 0, posJ = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = scanner.nextInt();
                if (matriz[i][j] > matriz[posI][posJ]) {
                    posI = i;
                    posJ = j;
                }
            }
        }

        System.out.println("Maior número: Linha " + (posI + 1) + " Coluna " + (posJ + 1));

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++)
                System.out.printf("%d ", matriz[i][j]);

            System.out.println("");
        }

        scanner.close();
    }
}
