package Provas.P220241;

public class LivroDeBiblioteca extends Livro{
    private boolean alugado;

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public LivroDeBiblioteca (String ISBN){
        super(ISBN);
    }
    public LivroDeBiblioteca(String titulo, String autor, String ISBN, String ano){
        super(titulo,autor,ISBN,ano);
    }
}

