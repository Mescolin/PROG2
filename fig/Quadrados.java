/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

public class Quadrados extends Figuras {
    float lados;
    Quadrados(float lado, String nome, String cor, boolean filled){
        super(nome, cor, filled);
        this.lados = lado;
    }
    
    @Override
    public double perimetro() {
        return 4* lados;
    }

    @Override
    public double area() {
        return (lados*lados);
    }
    
    public void teste(float lados){
        System.out.println("aaaa");
    }
     public void teste(){
        System.out.println("bbbbb");
    }

    public void setLados(float lados) {
        this.lados = lados;
    }
    
    
}
