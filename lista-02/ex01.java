import java.util.Scanner;

/**
 * 1. Desenvolva um algoritmo que, baseado no regulamento dos cursos de
 * graduação da UFRN (título VI / Cap 01 Art 114 e seguintes), receba três
 * notas de alunos de graduação e possa definir se ele foi aprovado,
 * reprovado ou se ele poderá fazer a prova de reposição.
 */

public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float nota1, nota2, nota3;
        String msg = "";

        nota1 = scanner.nextFloat();
        nota2 = scanner.nextFloat();
        nota3 = scanner.nextFloat();

        float result = (nota1 + nota2 + nota3) / 3;

        if (result > 6) {
            if (nota1 > 4 && nota2 > 4 && nota3 > 4)
                msg = "Aprovado";
            else
                msg = "Recuperação";
        } else if (result < 3)
            msg = "Reprovado";
        else
            msg = "Recuperação";

        System.out.println(msg);

        scanner.close();
    }
}