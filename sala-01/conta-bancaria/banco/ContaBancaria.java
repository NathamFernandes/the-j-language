package banco;

public class ContaBancaria {
    private Cliente responsavel;
    private double saldo;
    private boolean estaFechada;

    public ContaBancaria(Cliente responsavel) {
        this.responsavel = responsavel;
        this.saldo = 0;
        this.estaFechada = false;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void retirar(double valor) {
        this.saldo -= valor;
    }

    public void toggleConta() {
        this.estaFechada = !this.estaFechada;
    }

    public Cliente getCliente() {
        return this.responsavel;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getEstaFechada() {
        return this.estaFechada;
    }

    public void setEstaFechada(boolean estaFechada) {
        this.estaFechada = estaFechada;
    }
        
}