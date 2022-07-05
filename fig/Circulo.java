/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

public class Circulo extends Figuras {

    private double raio;

    Circulo(double raio, String nome, String cor, boolean filled) {
        super(nome, cor, filled);
        this.raio = raio;
    }

    @Override
    public double perimetro() {

        return  (raio * 2 *3.14);

    }

    @Override
    public double area() {

        return (3.14 * raio * raio);

    }
}
