public class ContaBancaria {

    private int numeroConta;
    private String nomeTitular;
    private double saldo;

    //Construtor
    public ContaBancaria(int numeroConta,String nomeTitular,double saldoInicial){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldoInicial;

    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
//Metodo para exibir informações da conta

public void exibirInformacoesConta(){
    System.out.println("Número da Conta:" + numeroConta);
    System.out.println("Nome do Titular:" + nomeTitular);
    System.out.println("Saldo da Conta: R$ " + saldo);


}

//Metodo para depositar dinheiro na conta

public void depositar(double valor){

    if (valor > 0){
        saldo += valor;
        System.out.println("Deposito de R$"+ valor + "realizado com sucesso");

    }else{
        System.out.println("Valor invalido");
    }
    
}

//Metodo para sacar dinheiro

public void sacar(double valor){
    if (valor > 0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Saque de R$"+ valor+ "realizado com sucesso");   
}else{
    System.out.println("Valor invalido");
}



}

}
