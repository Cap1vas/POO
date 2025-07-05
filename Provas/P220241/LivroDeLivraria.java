package Provas.P220241;

public class LivroDeLivraria extends Livro {
    
    private boolean vendido;


    public LivroDeLivraria (String ISBN){
        super(ISBN);
    }
    public LivroDeLivraria(String titulo, String autor, String ISBN, String ano){
        super(titulo,autor,ISBN,ano);
    }
    public boolean isVendido() {
        return vendido;
    }
    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }
}
