import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inteiros = new int[10];
        int pos, num;
        do {
            System.out.println("Insira a posição");

            try {
                pos = scanner.nextInt();
                if (pos > 9) {
                    throw new ArrayIndexOutOfBoundsException("Mt burro, é menor que 9");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erro: " + e.getMessage());
                break;
            }

            System.out.println("Insira o número");

            try {
                num = scanner.nextInt();
            } catch (NumberFormatException e) {
                System.out.println("Erro:" + e.getMessage());
                break;
            }

            inteiros[pos] = num;

            System.out.println("Vetor: ");
            for (int i = 0; i < 10; i++) {
                System.out.println(inteiros[i]);
            }

        } while (true);

        scanner.close();
    }
}
