package Provas.P120242;

public class Pteridofita extends Planta{
    
    
    public String toString(){
        return "[Pteridofita] ID:" + getId() + "Nome:"  + getNome() + "Tamanho" + getTamanho();
    }

    public Pteridofita(String id){
        super(id);
    }

}
