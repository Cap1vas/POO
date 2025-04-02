package Modifiers;

public class Conta {
    private String titular;
    private double saldo;
    private static int totalConta;
    public Conta(String titular){
        this.titular = titular;
        this.saldo = 0.0;
        totalConta++;
    }
    
    public void depositar(double valor){
        this.saldo = this.saldo + valor;
        
    }
    public void sacar(double valor){
        if((this.saldo - valor)<0){
            System.out.println("Não é possível sacar esse valor.");
            return;
        }else{
            this.saldo = this.saldo - valor;
            System.out.printf("Saldo atualizado! Valor após saque %d", this.saldo);
        }
    }
    double getSaldo(){
        return this.saldo;
    }
    String getTitular(){
        return this.titular;
    }
    static int getTotalContas(){
        return totalConta;
    }
    protected void imprimirDados(){
        System.out.println(this.saldo);
        System.out.println(this.titular);
    }

}
