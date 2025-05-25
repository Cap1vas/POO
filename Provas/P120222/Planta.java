package Provas.P120222;
import java.util.*;


public class Planta {
    private String id;
    private String nome;
    private double tamanho;

    public Planta(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    //Sobreescreve o método toString
    public String toString(){
        return id + "@ " + nome + "@ " + tamanho;
    }

    //COMO RESCREVE ESSA PRR
    public boolean equals(Object o){
        if(o instanceof Planta){
            Planta p = (Planta) o;
            return id.equals(p.id);
        }
        return false;
    }
    
}
