import java.util.Scanner;

/**
 * 5. Ler dois números inteiros, exibir o quociente e o resto da divisão inteira
 * entre eles.
 */
public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOne = scanner.nextInt();
        int numberTwo = scanner.nextInt();

        int quociente, resto;

        quociente = numberOne / numberTwo;
        resto = numberOne % numberTwo;

        System.out.println("Quociente: " + quociente + "\nResto: " + resto);

        scanner.close();
    }
}
