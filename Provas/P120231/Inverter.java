package Provas.P120231;

public class Inverter {
    

    public static void main(String[] args) {
        inverter("Banana");
    }

    public static String inverter(String str){
        String invertida = new StringBuilder(str).reverse().toString();
        System.out.println(invertida);
        return invertida;
    }
}
