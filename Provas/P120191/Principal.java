package Provas.P120191;
import java.util.*;

public class Principal {


    public double soma(Produto[] arr){
        Produto aux;
        double soma =0;
        for(int i=0;i<arr.length;i++){
            aux = arr[i];
            soma = soma + aux.getPreco();
        }
        return soma;
    }


    public Produto [] transformaListEmArray(List k){
        ArrayList x = new ArrayList();
        for( Object o : k ){
            if(o instanceof Produto){
                x.add( (Produto) o );
            }
        }
        Produto []arr = new Produto[x.size()];
        x.toArray(arr);
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        List retorno = Utils2.getLista();
        Produto p = new Produto(id);
        if(Utils.existe(retorno,p)) {
            for(int i = 0; i < retorno.size(); i++) {
                 if(retorno.get(i).equals(p)) {
                     System.out.println(retorno.get(i));
                 }
            }
        }
    }
}
