package locacao;

public class Carro {
    private boolean estaAlugado;
    private Cliente cliente;

    public Carro(Cliente cliente) {
        this.cliente = cliente;
    }

    public boolean getEstaAlugado() {
        return this.estaAlugado;
    }

    public void setEstaAlugado(boolean estaAlugado) {
        this.estaAlugado = estaAlugado;
    }
}
