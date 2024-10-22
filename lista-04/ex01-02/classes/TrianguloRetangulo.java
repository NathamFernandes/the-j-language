package classes;

public class TrianguloRetangulo {
    private double altura;
    private double largura;

    public TrianguloRetangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public double getLargura() {
        return largura;
    }

    public double area() {
        return this.largura * this.altura;
    }

    public double perimetro() {
        return (this.largura * 2) + (this.altura * 2);
    }
}
