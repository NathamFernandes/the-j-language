import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 10. Desenvolva um algoritmo para calcular a nota semestral de um aluno. A
 * nota semestral é obtida pela média aritmética entre a nota de 2 bimestres.
 * Cada nota de bimestre é composta por 2 notas de provas. O usuário deverá
 * fornecer todas as notas para o cálculo.
 */
public class ex10 {
    public static void main(String[] args) {
        DecimalFormat numberFormat = new DecimalFormat("0.00");
        Scanner scanner = new Scanner(System.in);
        double B1P1, B1P2, B2P1, B2P2;

        System.out.println("Nota B1P1: ");
        B1P1 = scanner.nextDouble();
        System.out.println("Nota B1P2: ");
        B1P2 = scanner.nextDouble();
        System.out.println("Nota B2P1: ");
        B2P1 = scanner.nextDouble();
        System.out.println("Nota B2P2: ");
        B2P2 = scanner.nextDouble();

        double media = (B1P1 + B1P2 + B2P1 + B2P2) / 4;

        System.out.println("Média do aluno: " + numberFormat.format(media));

        scanner.close();

    }

}
