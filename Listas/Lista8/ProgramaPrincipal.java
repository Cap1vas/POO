package Listas.Lista8;
import java.util.*;


public class ProgramaPrincipal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set <String> entrada = new HashSet<String>();
        for(int i =0;i<100;i++){
            entrada.add(sc.nextLine());
        }
        try{
            Utils u = new Utils();
            Map <String,Aluno> mapa = u.retornaDados(entrada);
            List <Aluno> listaAlunos = new ArrayList<>(mapa.values());
            Aluno.ordena(listaAlunos);
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }finally{
            sc.close();
        }
        
    }
}
