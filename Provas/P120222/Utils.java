package Provas.P120222;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
import java.util.*;

//Pós próxima aula ele deve mandar acabar e ai consigo terminar isso
public class Utils {
    

    public static boolean existe(ArrayList x, Planta y){
        return (x.contains(y));
    }

    //Como comparar? Ta falando pra usar comparator
    public static Planta [] ordena(List x){
        ArrayList <Planta> plantas = new ArrayList<Planta>();
        
        for(Object obj : x){
            if(obj instanceof Planta){
                Planta p = (Planta) obj;
                plantas.add(p);
            }
        }
        plantas.sort((p1,p2) -> Double.compare(p1.getTamanho(), p2.getTamanho()));

        Planta plantasArray[] = new Planta[plantas.size()];

        for(int i=0;i<plantas.size();i++){
            plantasArray[i] = plantas.get(i);
        }
        return plantasArray;
    }

    public static ArrayList retornaDados (ArrayList <String> stringsPlantas){
        ArrayList <Planta> plantas = new ArrayList<Planta>();
        for(String stringP : stringsPlantas){
            String [] partes = stringP.split("#");
            if(partes[3].equals("B")){
                Briofita obj = new Briofita(partes[0]);
                obj.setNome(partes[1]);
                obj.setTamanho(Double.parseDouble(partes[2]));
                plantas.add(obj);
            }else if(partes[3].equals("P")){
                Pteridofita obj = new Pteridofita(partes[0]);
                obj.setNome(partes[1]);
                obj.setTamanho(Double.parseDouble(partes[2]));
                plantas.add(obj);
            }
        }
        for(int i =0;i<plantas.size();i++){
            System.out.println(plantas.get(i));
        }
        return plantas;


        }
    
}
