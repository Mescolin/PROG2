package livro;

public class Editora {
    private String nome;
    private String localizacao;
    private final int maxLivros;
    private int quant;
    private Livro livros[];

    public Editora(String nome, String localizacao){
        this.nome = nome;
        this.localizacao = localizacao;
        this.maxLivros = 12;
        this.quant = 0;
        livros = new Livro[maxLivros];
    }

    public void adicionaLivro(Livro l){
        if(quant < maxLivros){
            livros[quant] = l;
            quant++;
            System.out.println("Livro adicionado!");
        }
        else {
            System.out.println("Nao foi possivel adicionar!");
        }
    }

    public void informaLivrosPublicados(){
        System.out.println("Livros publicados: ");
        for(int i = 0; i < quant; i++){
            livros[i].informa();
        }
    }
}
