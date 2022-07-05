/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

public abstract class Figuras {
    String nome;
    String cor;
    boolean filled;
    Figuras(String nome, String cor, boolean filled)
    {
        this.nome = nome;
        this.cor = cor;
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "Figuras{" + "nome=" + this.nome + ", cor=" + this.cor + ", filled=" + this.filled + '}';
    }
    
    public abstract double perimetro();
    public abstract double area();
    
}
