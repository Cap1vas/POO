package Modifiers;

public class Main {
    public static void main(String [] args){
        Conta user1 = new Conta("Guilherme");
        user1.depositar(1000);
        System.out.println(user1.getSaldo());
        System.out.println(Conta.getTotalContas());
        user1.sacar(1100);
    }
}
    
