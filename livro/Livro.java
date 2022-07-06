
package livro;

public class Livro {
    private String nome;
    private int paginas;

    public Livro(String nome, int paginas){
        this.nome = nome;
        this.paginas = paginas;
    }

    public void informa(){
        System.out.println("Nome: " + nome);
        System.out.println("N paginas: " + paginas);
    }
}
