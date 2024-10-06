import java.util.Scanner;

/**
 * 11. Faça um algoritmo que transforme uma velocidade fornecida em m/s pelo
 * usuário para Km/h. Para tal, multiplique o valor em m/s por 3,6.
 */

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double velMS = scanner.nextDouble();
        double velKMH = velMS * 3.6;
        System.out.println("Velocidade em KM/H: " + velKMH);

        scanner.close();
    }
}
