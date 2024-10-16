import java.util.Scanner;

/**
 * 10. Considere o seguinte caso: Guilherme está em um jogo de xadrez contra o
 * computador e deseja vencê-lo. Uma das peças do jogo é a torre, que consegue
 * executar movimentos em linha contra o adversário. Sabendo que há poucas peças
 * no jogo e considerando toda a movimentação que a torre consegue fazer,
 * desenvolva um algoritmo que seja capaz de receber uma posição no tabuleiro de
 * xadrez e consiga retornar todos os movimentos possíveis da torre, em questão.
 */

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char matriz[][] = new char[8][8];

        System.out.println("Linha: ");

        int linha = scanner.nextInt() - 1;

        System.out.println("Coluna: ");

        int coluna = scanner.nextInt() - 1;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (i == linha || j == coluna)
                    matriz[i][j] = 'X';
                else
                    matriz[i][j] = '-';
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.printf("%d | ", i + 1);

            for (int j = 0; j < 8; j++) {
                System.out.printf("%c ", matriz[i][j]);
            }

            System.out.printf("\n");
        }

        scanner.close();
    }
}
