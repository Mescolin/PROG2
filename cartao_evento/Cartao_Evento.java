package cartao_evento;

/**
 *
 * @author danie
 */
public class Cartao_Evento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                CartaoWeb[] cartao = new CartaoWeb[3];

        cartao[0] = new Natal("Tais");
        cartao[1] = new DiaDosNamorados("Betina");
        cartao[2] = new Aniversario("Diego");

        for(CartaoWeb c : cartao){
            c.showMessage();
        }
    }
    
}
