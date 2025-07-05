package Provas.P220241;
import java.util.*;
public class Instituicao {
    private String nome;
    private ArrayList listaDeLivros = new ArrayList<>();


    
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }

    public void inserir(Livro livro){
    if(livro instanceof LivroDeBiblioteca){
        this.listaDeLivros.add((LivroDeBiblioteca)livro);
    }
    
    
    }

    public ArrayList getLivros(){
        return this.listaDeLivros;
    }

}
