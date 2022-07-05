/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caneta;

/**
 *
 * @author danie
 */
public class Caneta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {    
    bic caneta1 = new caneta();
    bic.cor = "azul";
    caneta1.ponta = 0.7;
    caneta1.tampada = false;

    caneta1.status();

  }
}