
/**
 * 1 – Crie uma classe chamada Retângulo. Esta classe tem como atributos
 * encapsulados altura e largura (ou seja, estas propriedades não serão visíveis
 * pelo objeto). Crie dois métodos da seguinte forma: o primeiro para pedir e
 * atribuir valor para altura e o segundo para pedir e atribuir valor para
 * largura.
 * 
 * 2 – Crie mais dois métodos chamados area e perimetro, onde estes, quando 
 * chamados, retornam a área e o perímetro do retângulo (área do retângulo = largura * 
 * altura e o perímetro do retângulo é dado por (largura * 2) + (altura * 2)).
 */

import classes.Retangulo;

public class Main {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(11.2, 23);
        retangulo.setAltura(10);
        System.out.println("Area: " + retangulo.area() + " Perimetro: " + retangulo.perimetro());
    }
}
