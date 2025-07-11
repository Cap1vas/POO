package Provas.P220182;

public class Aluno implements Comparable <Aluno> {
    private String id;
    private String nome;
    private double nota;

    public Aluno(String id){
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean equals(Aluno a){
        return this.id.equals(a.id);
    }

    public int compareTo(Aluno a){
        return this.nome.compareTo(a.nome);
    }
}
