package Provas.P220241;

import java.util.ArrayList;
import java.util.Iterator;

public class Principal {
    
    public static void main(String[] args) {
        LivroDeBiblioteca lb = new LivroDeBiblioteca("aa", "bb", "cc", "2025");
        LivroDeBiblioteca lb2 = new LivroDeBiblioteca("aa", "bb", "cc", "2025");
        LivroDeLivraria ll = new LivroDeLivraria("aa", "bb", "cc", "2025");
        LivroDeLivraria ll2  = new LivroDeLivraria("aa", "bb", "cc", "2025");
        Instituicao i = new Instituicao();
        i.inserir(lb);
        i.inserir(lb2);
        i.inserir(ll);
        i.inserir(ll2);
        Principal.imprimeRelatorioGeral(i.getLivros());
    }

    public static void imprimeRelatorioGeral(ArrayList lista){
        Iterator i = lista.iterator();
        Object o;
        while(i.hasNext()){
            o = i.next();
            if(o instanceof LivroDeBiblioteca){
                LivroDeBiblioteca lb = (LivroDeBiblioteca) o;
                System.out.println(lb.getAno());
                System.out.println(lb.isAlugado());
                System.out.println(lb.getTitulo());
            }else if(o instanceof LivroDeLivraria){
                LivroDeLivraria ll = (LivroDeLivraria) o;
                System.out.println(ll.getAno());
                System.out.println(ll.isVendido());
                System.out.println(ll.getTitulo());
            }

        }
    }
}
