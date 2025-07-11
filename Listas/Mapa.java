package Listas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Mapa {
      public static double contaA(Map mapa){
        Set <String> keys = mapa.keySet();
        HashSet<String>s  = new HashSet<>();
        double soma =0;
        for( String a : keys){
           if(a.startsWith("A")){
                soma += (int) mapa.get(a);  
           }
        }
        System.out.println(soma);
        return soma; 
    }

    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<String, Integer>();
        mapa.put("A1", 5);
        mapa.put("A2", 6);
        mapa.put("A3", 7);
        mapa.put("BD21", 3);
        mapa.put("B2", 7);
        mapa.put("AC74", 2);
        mapa.put("A5", 8);
        mapa.put("B3", 3);

        System.out.println(contaA(mapa));
    }
}
