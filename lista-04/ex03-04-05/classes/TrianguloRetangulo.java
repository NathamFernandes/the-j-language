package classes;

public class TrianguloRetangulo {
    private double catetoBase;
    private double catetoAltura;
    private double hipotenusa;

    public TrianguloRetangulo() {
        this.catetoBase = 0;
        this.catetoAltura = 0;
        this.hipotenusa = 0;
    }

    public TrianguloRetangulo(double catetoBase, double catetoAltura) {
        this.catetoBase = catetoBase;
        this.catetoAltura = catetoAltura;

        double aux = Math.pow(catetoBase, 2) + Math.pow(catetoAltura, 2);
        this.hipotenusa = Math.pow(aux, 0.5);
    }

    public void setCatetoAltura(double catetoAltura) {
        this.catetoAltura = catetoAltura;
    }

    public void setCatetoBase(double catetoBase) {
        this.catetoBase = catetoBase;
    }

    public double getCatetoAltura() {
        return catetoAltura;
    }

    public double getCatetoBase() {
        return catetoBase;
    }

    public double hipotenusa() {
        if (hipotenusa == 0) {
            double aux = Math.pow(this.catetoBase, 2) + Math.pow(this.catetoAltura, 2);
            this.hipotenusa = Math.pow(aux, 0.5);
        }

        return this.hipotenusa;
    }

    public double area() {
        return (this.catetoBase * this.catetoAltura) / 2;
    }

    public double perimetro() {
        return this.catetoBase + this.catetoAltura + this.hipotenusa;
    }
}
