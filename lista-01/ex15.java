import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 15. Elaborar um algoritmo que calcule e apresente o volume de uma caixa
 * retangular, por meio * da formula: VOLUME = COMPRIMENTO*LARGURA*ALTURA.
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("0.00");

        double comprimento = scanner.nextDouble();
        double altura = scanner.nextDouble();
        double largura = scanner.nextDouble();

        double volume = comprimento * altura * largura;

        System.out.println("Volume: " + numberFormat.format(volume));

        scanner.close();
    }
}
