package Provas.P220242;

public class CriaturaMarinha {

    private String tag;
    private String nomeEspecie;
    private int profundidaEncontrada;

    public CriaturaMarinha(String tag, String nomeEspecie, int profundidaEncontrada){
        this.tag = tag;
        this.nomeEspecie = nomeEspecie;
        this.profundidaEncontrada = profundidaEncontrada;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getNomeEspecie() {
        return nomeEspecie;
    }

    public void setNomeEspecie(String nomeEspecie) {
        this.nomeEspecie = nomeEspecie;
    }

    public int getProfundidaEncontrada() {
        return profundidaEncontrada;
    }

    public void setProfundidaEncontrada(int profundidaEncontrada) {
        this.profundidaEncontrada = profundidaEncontrada;
    }

    public String toString(){

        return this.tag + " " + "" + this.nomeEspecie + " " + this.profundidaEncontrada + " ";
    }


}
