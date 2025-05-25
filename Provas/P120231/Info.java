package Provas.P120231;
import java.util.Scanner;

public class Info {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double somaPesos =0;
        System.out.println("A string deve ser no formato nome#peso#altura");
        System.out.println("\n Para encerrar a leitura escreva finalizar");
        String valor;
        for(int i =0;i<1000;i++){
            valor = entrada.nextLine();
            if(valor.contains("finalizar")){
                break;
            }
            String[] partes = valor.split("#");
            double peso = Double.parseDouble(partes[1]);
            somaPesos += peso;

        }
        double media = somaPesos/1000;
        System.out.println(media);
        
    }
}
