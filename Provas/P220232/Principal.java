package Provas.P220232;
import java.io.CharArrayReader;
import java.util.*;

public class Principal {
    public static void main(String[] args) {
        List <Carro> x = new ArrayList<Carro>();
        Carro a = new Carro();
        Carro b = new Carro();
        VidroEletrico v = new VidroEletrico("samsung", 10.0);
        Som s = new Som("jbl", 10.0);
        x.add(a);
        x.add(b);
        a.setAcessorio(v);
        b.setAcessorio(s);
    }
}
