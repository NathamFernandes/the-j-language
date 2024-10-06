/**
 * 1. Dado o tamanho da base e da altura de um retângulo, calcular a sua área e
 * o seu perímetro. [B=7.5 cm e H=12.3 cm]
 */
public class ex01 {

    public static void main(String[] args) {
        double base = 7.5;
        double altura = 12.3;

        double perimetro, area;

        perimetro = (base * 2) + (altura * 2);
        area = base * altura;

        System.out.println("Perímetro: " + perimetro + "cm\nArea: " + area + "cm");
    }
}