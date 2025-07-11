package Provas.P220231;
import java.util.*;


public class Principal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String code = sc.nextLine();
        List <Pais> x = CriaPaises.retornaPaises();
        if(x.contains(code)){
            int i = x.indexOf(code);
            Pais elemento = x.get(i);
            System.out.println(elemento.getDensidade());
            System.out.println(elemento.getNome());
            System.out.println(x);
        }else{
            if(x.eq)
        }
    }
    
}
