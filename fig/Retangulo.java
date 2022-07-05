/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

public class Retangulo extends Figuras {
    float altura, base;

Retangulo(float altura, float base, String nome, String cor, boolean filled){
    super(nome, cor, filled);
    this.altura = altura;
    this.base = base;
    
}
    @Override
    public double perimetro() {
        return (2*base) + (2*altura);
    }

    @Override
    public double area() {
        return (base*altura);
    }
    
}
