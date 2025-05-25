package Provas.P120232;

public class Televisao extends Produto implements Ligavel{
    
    public Televisao(String id){
        super(id);
    }

    public void ligável(){
        System.out.println("Televisao Ligada!");
    }
}
