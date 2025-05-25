package Provas.P120232;
import java.util.*;

public class Principal {
    


    public Produto [] transformaListEmArray(List k){
        Iterator<?> it = k.iterator();
        ArrayList <Produto> lista = new ArrayList <Produto>();
        while(it.hasNext()){
            Object obj = it.next();
            if(obj instanceof Produto){
                lista.add((Produto) obj );
            }
        }
        return lista.toArray(new Produto[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String idRecebido = sc.nextLine();
        Produto aux = new Produto(idRecebido);
        List lista = Utils.getLista();
        //como acessar as informacoes do produto??
        if(Utils.existe(lista, aux)){
            System.out.println(aux.getCor());
            System.out.println(aux.getId());
            System.out.println(aux.getPreco());
        }else{
            System.out.println("Nao existe");
        }
    }

}
