package Provas.P120191;

public class Notebook extends Produto implements Eletronico{
    

    public Notebook(String id){
        super(id);
    }
    public void ligar(){
        System.out.println("Ligado");
    }
    public void desligar(){
        System.out.println("Desligado");
    }

}
