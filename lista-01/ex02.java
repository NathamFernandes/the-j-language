/**
 * 2. Dado o tamanho do lado de um quadrado, calcular a área e o perímetro do
 * mesmo. [L=8 cm]
 */
public class ex02 {
    public static void main(String[] args) {
        byte lado = 8;

        int perimetro, area;

        perimetro = lado * 4;
        area = lado * lado;

        System.out.println("Perímetro: " + perimetro + "cm\nArea: " + area + "cm");
    }
}
