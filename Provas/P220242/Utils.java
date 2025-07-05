package Provas.P220242;
import java.util.*;

public class Utils {
    
    public Map retornaDados(Set conjuntosCriaturas){
        Map mapa = new HashMap();
        Iterator i = conjuntosCriaturas.iterator();
        while(i.hasNext()){
            String elemento = (String )i.next();
            String [] partes = elemento.split("#");
            if(partes.length == 3){
                int profundidade = Integer.parseInt(partes[2]);
                CriaturaMarinha c = new CriaturaMarinha(partes[0], partes[1],profundidade);
                
                mapa.put(partes[0],c);
            }else{
                throw new FormatoIncorretoException("FormatoIncorretoException: O formato da String "+elemento+"está incorreto");

            }
        }
        return mapa;

        
    }

}
