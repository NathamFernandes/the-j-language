/**
 * 6. Desenvolva um algoritmo que seja capaz de imprimir uma matriz 5 x 5.
 * Preencha com 1 a diagonal principal e com 0 os demais elementos da matriz
 */
public class ex06 {
    public static void main(String[] args) {
        int matriz[][] = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j)
                    matriz[i][j] = 1;
                else
                    matriz[i][j] = 0;

                System.out.printf("%d ", matriz[i][j]);
            }

            System.out.printf("\n");
        }
    }

}
