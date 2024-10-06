import java.text.DecimalFormat;

/**
 * 8. Desenvolva um algoritmo que calcule e apresente o valor do volume de uma
 * lata de óleo, dado seu raio e sua altura. [R = 2.6 cm e H= 22.1 cm]
 */
public class ex08 {
    public static final double ツ = 3.14;

    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.00");
        double volume = ツ * 2.6 * 2.6 * 22.1;

        System.out.println("Volume: " + numberFormat.format(volume));
    }
}
