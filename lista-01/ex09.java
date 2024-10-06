import java.util.Scanner;

/**
 * 9. Converter um número inteiro, informado pelo usuário, e que seja menor que
 * 32. O algoritmo deve ser capaz de converter e exibir esse número para sua
 * representação em binário. OBS.: utilize apenas estruturas matemáticas para
 * essa conversão.
 * 
 * Esse foi legalzinho de pensar e fazer.
 */
public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int resto;
        String binario = "";

        do {
            resto = number % 2;
            binario = resto + binario;
            number = number / 2;

            if (number == 1 || number == 0)
                binario = number + binario;

        } while (number != 1 && number != 0);

        System.out.println("Em binário: " + binario);

        scanner.close();
    }
}
