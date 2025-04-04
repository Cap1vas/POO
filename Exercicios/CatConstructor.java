package Exercicios;

public class CatConstructor {
    int age;
    String name;
    public CatConstructor(){
        this.name = "Unknowm";
        this.age = 0;
    }  

    public int getAge(){
        return this.age;
    }
    public String getName(){
        return this.name;
    }
    public static void main(String [] args){
        CatConstructor gato = new CatConstructor();
        System.out.println("The age of my cat is "+ gato.age + " and it's name is "+ gato.name);
    }
}
    