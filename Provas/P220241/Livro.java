package Provas.P220241;

public class Livro {
    private String titulo;
    private String autor;
    private String ISBN;
    private String ano;

    public Livro(String ISBN){
        this.ISBN = ISBN;
    }
    public Livro(String titulo, String autor, String ISBN, String ano){
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public String getAno() {
        return ano;
    }
    public void setAno(String ano) {
        this.ano = ano;
    }

    public boolean equals(Object o){
        if(o instanceof Livro){
            Livro l = (Livro) o;
            return ISBN.equals(l.ISBN);
        }
        return false;
    }
     
}
