package Provas.P220231;
import java.util.*;

public class CriaPaises {
    
    public static List<Pais>retornaPaises(){
        Pais a = new Pais("CN","Canadá",200);
        Pais b = new Pais("USA","Estados unidos da américas",150);
        Pais c = new Pais("MEX","México",100);
        List <Pais> x = new ArrayList<Pais>();
        x.add(a);
        x.add(b);
        x.add(c);
        a.setFronteira(c);
        b.setFronteira(c);
        b.setFronteira(a);
        c.setFronteira(b);
        return x;
    }
    public static List<Pais> retornaPaises(String [] arr) throws FormatoIncorretoException{
        List <Pais> paises = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String [] partes = arr[i].split("#");
            if(partes.length != 4){
                throw new FormatoIncorretoException(arr[i] + ((partes.length)-1));
            }
            Pais p = new Pais(partes[0],partes[1],Double.parseDouble(partes[3]));
            p.setPopulacao(Integer.parseInt(partes[3]));
        }
        return paises;
    }



    
}
