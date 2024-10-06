import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 13. Efetuar o cálculo da quantidade de litros de combustível gastos em uma
 * viagem, utilizando-se um automóvel que faz 12km por litro. Para obter o
 * cálculo, o usuário deverá fornecer o tempo gasto e a velocidade média
 * percorrida com a formula: DISTÂNCIA=TEMPO* VELOCIDADE.
 */

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat numberFormat = new DecimalFormat("0.00");

        int tempoMin = scanner.nextInt();
        double VMKMH = scanner.nextDouble();

        int tempoSeg = tempoMin * 60;
        double VMMS = VMKMH / 3.6;

        double distanciaKM = (VMMS * tempoSeg) / 1000;

        double litros = distanciaKM / 12;

        System.out.println("Litros gastos: " + numberFormat.format(litros));

        scanner.close();
    }
}
