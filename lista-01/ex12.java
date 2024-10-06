import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 12. Um circuito elétrico é composto de duas resistências R1 e R2 em paralelo,
 * e ambas em sequência de uma resistência R3. Faça um algoritmo para calcular a
 * resistência equivalente desse circuito, no qual o usuário possa inserir o
 * valor das resistências R1, R2 e R3.
 */
public class ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("0.00");

        double r1, r2, r3;

        r1 = scanner.nextDouble();
        r2 = scanner.nextDouble();
        r3 = scanner.nextDouble();

        double firstSum = 1 / ((1 / r1) + (1 / r2));
        double total = firstSum + r3;

        System.out.println("Resistencia total: " + numberFormat.format(total));

        scanner.close();
    }
}
