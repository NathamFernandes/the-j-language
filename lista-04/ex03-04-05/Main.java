
/**
 * 3- Crie uma classe chamada trianguloretangulo. Esta classe tem como atributos
 * encapsulados a catetobase e a catetoaltura. Crie dois métodos para pedir e atribuir
 * valores separadamente para base e altura como no exercício 1.
 * 
 * 4 - Crie mais um atributo encapsulado chamado hipotenusa. Este atributo não será
 * informado pelo usuário. Ele será calculado através de um método que utiliza os valores
 * dos catetos lidos no exercício 3 e determinados através da fórmula a2 = b2 +c2.
 * 
 * 5- Crie um método que mostra o valor da hipotenusa calculado no exercício 4. Crie 
 * também mais dois métodos: um para retornar a área do triângulo (catetobase *
 * catetoaltura) / 2 e perímetro do triângulo (catetobase + catetoaltura + hipotenusa).
 */

import classes.TrianguloRetangulo;

public class Main {
    public static void main(String[] args) {
        TrianguloRetangulo triangulo = new TrianguloRetangulo(11.2, 23);
        triangulo.setCatetoBase(10);
        System.out.println("Hipotenusa: " + triangulo.hipotenusa() + " Area: " + triangulo.area() + " Perímetro: "
                + triangulo.perimetro());
    }
}
