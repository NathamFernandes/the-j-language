import java.util.Scanner;

/**
 * 6. O número de Euler pode ser representado e calculado por meio da utilização
 * da série de
 * Taylor e quando X=1, como a soma da seguinte série infinita:
 * Desenvolva um algoritmo que leia o número de termos da série (n) e imprima
 * como saída o cálculo do número de Euler para cada um dos n primeiros
 * elementos da série.
 * 
 * --
 * 
 * 7. O fatorial é uma operação muito importante para o estudo e desenvolvimento
 * da análise combinatória. Na matemática o número seguido do símbolo de
 * exclamação (!) é conhecido como fatorial. Desenvolva um algoritmo que imprima
 * o fatorial de um número N, digitado pelo usuário).
 */
public class ex06e07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = scanner.nextInt();
        float euler = 1;

        double test;

        for (int i = 1; i <= numero; i++) {
            euler = euler + ((float) 1 / fatorial(i));
        }

        System.out.println(euler);

        scanner.close();
    }

    public static int fatorial(int numero) {

        if (numero == 1)
            return 1;
        else
            return numero * fatorial(numero - 1);
    }
}