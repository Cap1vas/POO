package Provas.P120232;

import Provas.P120222.Planta;

public class Produto {
    private String id;
    private String cor;
    private Double preco;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    public boolean equals(Object o){
        if(o instanceof Produto){
            Produto p = (Produto) o;
            return id.equals(p.id);
        }
        return false;
    }

    public Produto(String id){
        this.id = id;
    }
}
