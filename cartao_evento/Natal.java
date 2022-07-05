package cartao_evento;

public class Natal extends CartaoWeb {
    Natal(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("Feliz Natal " + super.getDestinatario() + "!");
    }
}
