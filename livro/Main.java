package livro;

public class Main{
    public static void main(String[] args){
        Livro l1 = new Livro("Harry Potter", 345);
        Livro l2 = new Livro("Sapiens", 630);
        Livro l3 = new Livro("Before the coffee gets cold", 360);
        Livro l4 = new Livro("A little life", 1030);
        Livro l5 = new Livro("Lost connections", 600);

        Editora e1 = new Editora("New Editor", "UK");
        Editora e2 = new Editora("Elsevier", "US");

        e1.adicionaLivro(l1);
        e1.adicionaLivro(l2);

        e2.adicionaLivro(l3);
        e2.adicionaLivro(l4);
        e2.adicionaLivro(l5);

        e1.informaLivrosPublicados();

        e2.informaLivrosPublicados();
    }
}