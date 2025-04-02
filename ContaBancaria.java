public class ContaBancaria {
    String nomeTitular;
    String agencia;
    int numero;
    double saldo;
    String dataDeAbertura;
    public static void main(String [] args){
        ContaBancaria user1 = new ContaBancaria();
        user1.nomeTitular = "Igor Affonso";
        user1.agencia = "0000";
        user1.numero = 121212;
        user1.saldo = 50.00;
        user1.dataDeAbertura = "Dia 28/03/2023";

        System.out.println(user1.calculaRendimento());
        System.out.println(user1.sacar(20));
        System.out.println(user1.depositar(40));
        user1.recuperaDados();
    }

    double sacar(double retirada){

        double novoSaldo = this.saldo - retirada;
        return novoSaldo;
    }
    double depositar(double deposito){
        double newSaldo = this.saldo + deposito;
        return newSaldo;
    }
    double calculaRendimento(){
        double rendimento = this.saldo * 1.01;
        return rendimento;
    }
    void recuperaDados(){
        System.out.printf("Infos: \n %s \n %s \n %d \n %f \n %s",this.nomeTitular,this.agencia,this.numero,this.saldo,this.dataDeAbertura);
    }
}
