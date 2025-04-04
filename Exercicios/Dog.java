package Exercicios;

public class Dog {
    String color;
    String name;

    public Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public static void main(String [] args){
        Dog clifford = new Dog("Clifford, the giant dog", "Bright red");
        System.out.println("I will describe my dog:\n" + clifford.name + "\n" + clifford.color );
    }
}
