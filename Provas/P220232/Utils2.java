package Provas.P220232;
import java.util.*;

public class Utils2 {
    

    public static Map transformaListaEmMapa(List Carros){
        Iterator <Carro> i = Carros.iterator();
        Map <String, Carro>mapa = new HashMap<String,Carro>();
        while(i.hasNext()){
            Object o = i.next();
            if(o instanceof Carro){
                Carro c = (Carro) o;
                mapa.put(c.getPlaca(),c);
            }
        }
        return mapa;
    }


    public static void imprimirCustos(List <Carro> x){
        Iterator <Carro> i = x.iterator();
        double totalAcessorio =0;
        double totalImposto = 0;

        while(i.hasNext()){
            Carro elemento = i.next();
            List <Acessorio> y = elemento.getAcessorio();
            for(Acessorio a : y){
                totalAcessorio = totalAcessorio + a.getPreco();
                if(a instanceof VidroEletrico){
                    totalImposto = totalImposto + a.calcularImposto();
                }else if(a instanceof Som){
                    totalImposto= totalImposto + a.calcularImposto();
                }
            }
        }
        System.out.println(totalAcessorio);
        System.out.println(totalImposto);
    }
}
