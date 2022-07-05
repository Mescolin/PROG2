/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caneta;

/**
 *
 * @author danie
 */
public class bic {
    
      String cor;
  double ponta;
  boolean tampada;

  void status(){
    System.out.println("Cor: " + cor);
    System.out.println("Ponta: " + ponta);
    System.out.println("Tampada: " + (tampada ? "sim":"não"));
  }

  void tampar(){
    tampada = true;
  }

  void destampar(){
    tampada = false;
  }

  void escrever(){
    if(tampada){
      System.out.println("Caneta tampada!");
    }
    else {
      System.out.println("Caneta escrevendo!");
    }

    System.out.println("Caneta " + (tampada ? "tampada":"escrevendo"));
  }
}
