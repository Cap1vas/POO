package Provas.P220241;

public class Carro implements Corredor{
    private int distancia;
    private int tempo;
    public void calcularVelocidade(){
        if (tempo > 0) {
            double velocidade = distancia / tempo;
            System.out.println("Velocidade: " + velocidade + " km/h");
        } else {
            System.out.println("Tempo deve ser maior que zero para calcular velocidade");
        }
    }
}
