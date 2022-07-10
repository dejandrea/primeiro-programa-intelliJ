package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        System.out.println(gato);

        Livro livro1 = new Livro("O pequeno principe",300,"lsjflksjf");
        System.out.println(livro1);


//        int a = 5;
//        int b = 3;
//        System.out.println("Hello World!"+(a+b));
    }
}

class Livro{
    private String nome;
    private Integer nPages;
    private String author;

    public Livro(String nome, Integer nPages, String author) {
        this.nome = nome;
        this.nPages = nPages;
        this.author = author;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPages() {
        return nPages;
    }

    public void setnPages(Integer nPages) {
        this.nPages = nPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPages=" + nPages +
                ", author='" + author + '\'' +
                '}';
    }
}
