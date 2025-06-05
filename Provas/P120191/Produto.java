package Provas.P120191;

public class Produto {
    private String id;
    private String cor;
    private double preco;
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
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto(String id){
        this.id=id;
    }

    public String toString(){
        return getId() + "-" + getCor() + "-" + getPreco();
    }

    public boolean equals(Object o){
        if(o instanceof Produto){
            Produto p = (Produto) o;
            return id.equals(p.id);
        }
        return false;
    }
    
    
}
