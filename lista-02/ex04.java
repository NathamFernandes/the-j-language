import java.util.Scanner;

/**
 * 4. Escreva um programa que verifique a validade de uma senha fornecida pelo
 * usuário. A senha válida é o número 1234. Devem ser impressas as seguintes
 * mensagens:
 * 
 * ACESSO PERMITIDO caso a senha seja válida.
 * ACESSO NEGADO caso a senha seja inválida.
 * OBS.: Utilize a estrutra Do While{ }
 */
public class ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ano;

        do {
            ano = scanner.next();

            if (!ano.equals("1234"))
                System.out.println("ACESSO NEGADO");

        } while (!ano.equals("1234"));

        System.out.println("ACESSO PERMITIDO");

        scanner.close();
    }
}
