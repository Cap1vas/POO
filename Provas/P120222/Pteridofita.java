package Provas.P120222;

public class Pteridofita extends Planta {
    public Pteridofita(String id){
        super(id);
    }
    public String toString(){
        return "[Pteridofita]" + "@" + getId() + "@" + getNome() + "@" + getTamanho();
    }
}
