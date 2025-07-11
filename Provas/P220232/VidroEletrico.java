package Provas.P220232;

public class VidroEletrico extends Acessorio{
    
    public VidroEletrico(String marca, double preco){
        super(marca,preco);
    }

    public double calcularImposto(){
        double imposto = (this.getPreco()) * 0.2;
        return imposto;
    }


}
