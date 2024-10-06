import java.text.DecimalFormat;

/**
 * 4. Dado os três lados de um triângulo determinar o perímetro do mesmo. [L=5.2
 * cm].
 */

public class ex04 {
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.00");
        double lado = 5.2;

        double perimetro = lado * 3;

        System.out.println("Perímetro: " + numberFormat.format(perimetro) + " cm");
    }
}
