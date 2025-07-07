package Listas.Lista8;
import java.util.*;
public class Utils {
    

    public boolean existe(List <Aluno> x, Aluno y){
        return x.contains(y);
    }

    public static void main(String[] args) {
        Aluno Carol = new Aluno("id");
        Aluno Bernardo = new Aluno("id2");
        Carol.setNome("Carol");
        Bernardo.setNome("Bernardo");
        List <Aluno> x = new ArrayList<Aluno>();
        x.add(Carol);
        x.add(Bernardo);
        Aluno.ordena(x);
        Utils y = new Utils();
        System.out.println(y.existe(x, Bernardo)  + " " +Carol.equals(Bernardo));
        System.out.println(Bernardo);
        for (Aluno aluno : x) {
            System.out.println(aluno.getNome());
        }
    }

    public Map<String, Aluno> retornaDados(Set conjuntoAlunos){
        Map <String, Aluno> mapa = new HashMap<String,Aluno>();
        Iterator<String> i = conjuntoAlunos.iterator();
        while(i.hasNext()){
            String elemento = i.next();
            String [] partes = elemento.split("#");
            if(partes[3].equals("E")){
                AlunoEspecial e = new AlunoEspecial(partes[0]);
                e.setNome(partes[1]); 
                e.setNota(Double.parseDouble(partes[2]));
                mapa.put(partes[0],e);
            }else if(partes[3].equals("R")){
                AlunoRegular r = new AlunoRegular(partes[0]);
                r.setNome(partes[1]);
                r.setNota(Double.parseDouble(partes[2]));
                mapa.put(partes[0],r);
            }else{
                throw new RuntimeException("Erro de runtime");
            }
        }
        return mapa;
    }

}
