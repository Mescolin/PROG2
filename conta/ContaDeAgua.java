package conta;

    public class ContaDeAgua extends Conta {
    private double qtd_litros;

    public ContaDeAgua(String nome, String endereco, double qtd_litros, double preco){
        super(nome, endereco);
        this.qtd_litros = qtd_litros;
        super.preco = preco;
    }

    @Override
    public void calcularTotal(){
        System.out.println("Total: " + (qtd_litros*preco));
    }

    @Override
    public String toString(){
        return "Conta de Agua";
    }
}