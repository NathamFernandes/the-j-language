import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 7. Dado que a fórmula para conversão de Fahrenheit para Celsius é C = 5/9 (F
 * – 32), desenvolva um algoritmo em Java que possa ler um valor de temperatura
 * em Fahrenheit, calcular e exibi-lo na escala de Celsius.
 */
public class ex07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("0.00");

        double valueF = scanner.nextDouble();

        double valueC = ((valueF - 32) * 5) / 9;

        System.out.println("Valor em Celsius: " + numberFormat.format(valueC));

        scanner.close();
    }
}
