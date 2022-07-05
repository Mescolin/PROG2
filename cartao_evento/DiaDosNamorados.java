package cartao_evento;

public class DiaDosNamorados extends CartaoWeb {
    DiaDosNamorados(String destinatario){
        super(destinatario);
    }

    @Override
    public void showMessage(){
        System.out.println("Feliz dia dos namorados " + super.getDestinatario() + "!");
    }
}