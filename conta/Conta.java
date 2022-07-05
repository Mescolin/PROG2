package conta;

public abstract class Conta{
    private String nome;
    private String endereco;
    protected double preco;

    public Conta(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public abstract void calcularTotal();

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Conta " + nome;
    }
}