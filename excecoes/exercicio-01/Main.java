import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer soma = 0;

        do {
            try {
                System.out.println("Digte um número: ");
                soma = soma + scanner.nextInt();
                if (soma > 100) {
                    throw new ExcecaoAcimaDeCem("Passou de 100.");
                }
                System.out.println("Soma atual: " + soma);
            } catch (ExcecaoAcimaDeCem e) {
                System.out.println("Exceção throwada: " + e.getMessage());
                break;
            }

        } while (true);

        scanner.close();
    }
}

public class ExcecaoAcimaDeCem extends Exception {
    public ExcecaoAcimaDeCem(String mensagem) {
        super(mensagem);
    }
}
