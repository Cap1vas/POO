package Provas.P120242;
import java.util.*;


public class Utils {
    

public static boolean moderar(String frase){
    String [] partes = frase.split(" ");
    for(String palavra : partes){
        if(Utils.getPalavroes().contains(palavra.toLowerCase())){
            return true;
        }
        else{
            continue;
        }
    }
    return false;

}

//Estudar essa funcao
public static Planta [] ordena(List lista){
    ArrayList <Planta> plantas = new ArrayList<Planta>();
    for(Object obj : lista){
        if(obj instanceof Planta){
            Planta p = (Planta) obj;
            plantas.add(p);
        }
    }
    plantas.sort((p1,p2) -> Double.compare(p1.getTamanho(), p2.getTamanho()));
    Planta [] arrayPlanta = new Planta[plantas.size()];
    arrayPlanta = plantas.toArray(arrayPlanta);
    return arrayPlanta;
}


public static boolean existe(ArrayList x, Planta planta){
    if(x.contains(planta)){
        return true;
    }else{
        return false;
    }
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String frase = sc.nextLine();
    Utils.moderar(frase);
}   
    
}
