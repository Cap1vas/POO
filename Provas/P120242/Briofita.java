package Provas.P120242;

public class Briofita extends Planta {
    


    public String toString(){
        return "[Briofita] ID:" + getId() + "Nome:"  + getNome() + "Tamanho" + getTamanho();
    }
    
    public Briofita(String id){
        super(id);
    }
}
