package Provas.P120182;
import java.util.*;

public class Principal {




    public void soma(Biscoito [] arr){
        int soma = 0;
        for(int i =0;i<arr.length;i++){
            soma = soma + arr[i].getPreco();
        }
        System.out.println(soma);
    }

    public Biscoito [] transformaListemBiscoitos(List k){
        ArrayList biscoito = new ArrayList();

        for(Object o : k){
            if(o instanceof Biscoito){
                biscoito.add((Biscoito) o);
            }
        }
        Biscoito [] arr = new Biscoito[biscoito.size()];
        
        biscoito.toArray(arr);
        return arr;
        
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        sc.close();
        Biscoito b = new Biscoito(id);
        List retorno = Utils2.getLista();
        List <Biscoito> biscoitos = new List();
        for(Object o : retorno){
            if(o instanceof Biscoito){
                biscoitos.add((Biscoito) o);
            }
        }
        if(Utils.existe(biscoitos, b)){
            for(int i=0;i<biscoitos.size();i++){
                if(biscoitos.get(i).equals(b.getId())){
                    System.out.println(biscoitos.get(i).getId());
                    System.out.println(biscoitos.get(i).getCor());
                    System.out.println(biscoitos.get(i).getPreco());
                }
            
            }
        }

    }
}
