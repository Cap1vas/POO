package Exercicios;

public class Book {
    String author, title;
    double price;
    public Book(){
        this.author = "Default";
        this.title = "Generic title";
        this.price = 0.0;
    }
    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }
    public Book(String author, String title, double price){
        this.author = author;
        this.title = title;
        this.price = price;
    }

    public static void main(String [] args){
        Book livro = new Book();
        Book livro2 = new Book("H.P. Lovecraft", "Call of Cthulhu");
        Book livro3 = new Book("J. K. Rowling", "Harry Porter: the philosopher stone",25.0);
        System.out.println(livro.author);
        System.out.println(livro2.author);
    }
}