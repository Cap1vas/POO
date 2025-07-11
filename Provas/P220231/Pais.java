package Provas.P220231;
import java.util.*;

public class Pais {
    private String codigo;
    private String nome;
    private int populacao;
    private double dimensao;
    private List <Pais> fronteira = new ArrayList<Pais>();

    public Pais(String codigo){
        this.codigo = codigo.toUpperCase();
    }
    public Pais(String codigo, String nome, double dimensao){
        this.codigo = codigo.toUpperCase();
        this.nome = nome;
        this.dimensao = dimensao;
    }
    public int getPopulacao() {
        return populacao;
    }
    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }
    public double getDimensao() {
        return dimensao;
    }
    public void setDimensao(double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean equals(Object o){
        if( o instanceof Pais){
            Pais p =  (Pais) o;
            return this.codigo.equals(p.codigo);
        }
        return false;
    }

    public double getDensidade(){
        double densidade = getPopulacao()/getDimensao();
        return densidade;
    }

    public boolean getFronteira(Pais p){
        return this.fronteira.contains(p);
    }
    
}
