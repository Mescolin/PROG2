/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fig;

import java.util.ArrayList;

public class Fig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Figuras> fig = new ArrayList();
        Circulo cir = new Circulo(2, "aa", "bb", true);
        fig.add(cir);
        System.out.println(fig.get(0).toString());
        System.out.println(fig.get(0).area());
        Quadrados q1 = new Quadrados(12, "aa", "bb", true);
        q1.teste();
        q1.teste(13);


    }

}
