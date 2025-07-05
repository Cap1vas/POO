package Provas.P220242;
import java.util.*;


public class TesteAnimais {
    public static void main(String[] args) {
        List <Animal>animais = new ArrayList<Animal>();
        Pato p = new Pato();
        Cachorro c = new Cachorro();
        animais.add(c);
        animais.add(p);
        Iterator <Animal> i = animais.iterator();

        while(i.hasNext()){
            Animal o = i.next();
            
            if(o instanceof Pato){
                Pato p2 = (Pato) o;
                System.out.println("Pato emitindo som:");
                p2.emitirSom();
                System.out.println("Pato se mexendo");;
                p2.mover();
            }else if(o instanceof Cachorro){
                Cachorro c2 = (Cachorro) o;
                System.out.println("Cachorro emitindo som");
                c2.emitirSom();
                System.out.println("Cachorro se movendo");
                c2.mover();
            }
        }
    }

}
