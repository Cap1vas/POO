package Provas.P120242;

public class Planta {
    private String id;
    private String nome;
    private double tamanho;


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

    public String toString(){
        return "ID:" +  getId() + "," + "Nome:" + getNome() + "," + "Tamanho:" + getTamanho();
    }

    public boolean equals(Object o){
        if(o instanceof Planta){
            Planta p = (Planta) o;
            return id.equals(p.id);
        }
        return false;
    }

    public Planta(String id){
        this.id = id;
    }
}
