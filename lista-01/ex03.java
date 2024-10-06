import java.text.DecimalFormat;

/**
 * 3. Dado o tamanho do raio de uma circunferência, calcular a área e o
 * perímetro da mesma. [R=2,8 cm].
 */
public class ex03 {
    public static final double PI = 3.14;

    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.00");
        double raio = 2.8;

        double perimetro, area;

        perimetro = 2 * PI * raio;
        area = PI * (raio * raio);

        System.out.println(
                "Perímetro: " + numberFormat.format(perimetro) + "cm\nArea: " + numberFormat.format(area) + "cm");
    }

}
