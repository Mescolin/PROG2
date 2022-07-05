package cartao_evento;

public abstract class CartaoWeb {
    private final String destinatario;

    CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }

    public abstract void showMessage();

    public String getDestinatario(){
        return this.destinatario;
    }
}
