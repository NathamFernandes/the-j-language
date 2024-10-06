import java.util.Scanner;

/**
 * 14. Ler dois valores do usuário, para as variáveis A e B, efetuando a troca
 * dos valores de forma que a variável A passe a assumir o valor da variável B
 * e a variável B possa assumir o valor da variável A. OBS.: apenas duas
 * variáveis podem ser declaradas (sugestão: declare variáveis do tipo inteiro).
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;

        a = scanner.nextInt();
        b = scanner.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("Output: A: " + a + "\nB: " + b);

        scanner.close();
    }
}
