package Exercicios;

public class Student {
    static int studentId;
    String studentName;
    double grade;   

    public Student(){
        Student.studentId++;
    }
    public Student(String studentName, double grade){
        this();   
        this.studentName = studentName;
        this.grade = grade;
    }
    public static void main( String [] args){
        Student aluno = new Student("Guilherme",9.8);
        System.out.println("Saída" + aluno.studentName +"\n"+ Student.studentId);
    }
}
