import java.util.Scanner;

/**
 * 6. Solicitar a idade de uma pessoa, em dias, e informar na tela a idade em
 * anos, meses e dias.
 */
public class ex06 {
    public static final int DIAS_ANO = 360, DIAS_MES = 30;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dias = scanner.nextInt();

        int ano, mes, dia;

        ano = dias / DIAS_ANO;
        dias = dias % DIAS_ANO;

        mes = dias / DIAS_MES;
        dias = dias % DIAS_MES;

        dia = dias;

        System.out.println("Idade: " + ano + " anos, " + mes + " meses e " + dia + " dias!");

        scanner.close();
    }
}
