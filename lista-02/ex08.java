import java.util.Scanner;

/**
 * 8. Desenvolva um algoritmo que receba um número natural inteiro e retorne
 * todos os seus divisores. (utilize WHILE)
 */
public class ex08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numeros = "";

        int numero = scanner.nextInt();
        int divisor = 1;

        while (divisor <= numero / 2) {
            if (numero % divisor == 0) {
                numeros += divisor + " ";
            }
            divisor++;
        }

        numeros += numero;

        System.out.println(numeros);

        scanner.close();
    }
}
