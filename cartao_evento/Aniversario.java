package cartao_evento;

public class Aniversario extends CartaoWeb {
    Aniversario(String destinatario){
        super(destinatario);
    }

    public void showMessage(){
        System.out.println("Feliz aniversário " + super.getDestinatario() + "!");
    }
}