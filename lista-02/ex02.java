import java.util.Scanner;

/**
 * 2. Escreva um programa que leia um caractere e diga se ele é uma vogal,
 * consoante ou um número (qualquer outra opção deve ser caracterizada
 * como um símbolo).
 */
public class ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vowels = "AEIOU";
        String consonants = "BCDFGHJKLMNPQRSTVWXYZ";
        String numbers = "0123456789";
        String msg;

        char character = Character.toUpperCase(scanner.next().charAt(0));

        if (vowels.indexOf(character) >= 0)
            msg = "Vogal";
        else if (consonants.indexOf(character) >= 0)
            msg = "Consoante";
        else if (numbers.indexOf(character) >= 0)
            msg = "Número";
        else
            msg = "Símbolo";

        System.out.println(msg);

        scanner.close();
    }
}
