import banco.ContaBancaria;
import banco.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Natham", "20");
        ContaBancaria conta1 = new ContaBancaria(cliente1);

        conta1.depositar(11.11);
        conta1.retirar(5);

        System.out.println(conta1.getSaldo());
    }
}