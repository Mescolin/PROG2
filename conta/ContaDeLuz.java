package conta;

public class ContaDeLuz extends Conta {
    private double qtd_kw;
    

    public ContaDeLuz(String nome, String endereco, double qtd_kw, double preco){
        super(nome, endereco);
        this.qtd_kw = qtd_kw;
        super.preco = preco;
    }

    @Override
    public void calcularTotal(){
        System.out.println("Total: " + (qtd_kw*preco));
    }

    @Override
    public String toString(){
        return "Conta de Luz";
    }
}