import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Solicitações do usuario
        System.out.println("Digite o numero da conta:");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do titular:");
        String nomeTitular = scanner.nextLine();

        System.out.println("Digite o saldo inicial:");
        double saldoInicial = scanner.nextDouble();

        //Cria uma nova conta bancaria
        ContaBancaria conta = new ContaBancaria(numeroConta,nomeTitular,saldoInicial);

        //Exibe informações da conta
        System.out.println("/nConta bancaria criada com sucesso!");
        conta.exibirInformacoesConta();

        //Menu para realizar operações
        int opcao;
        do{
            System.out.println("/nMenu de Operações:");
            System.out.println("1. Exibir informações da Conta");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            System.out.println("Digite a opção:");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                conta.exibirInformacoesConta();
                    
                    break;
                case 2:
                System.out.println("Digite o valor a ser depositado:");
                double valorDeposito = scanner.nextDouble();
                conta.depositar(valorDeposito);
                    break;

                 case 3:
                 System.out.println("Digite o valor a sacado:");
                 double valorSaque = scanner.nextDouble();
                 conta.sacar(valorSaque);
                    break;

                 case 4:
                 System.out.println("Saindo...");
                    break;
        
                default:
                System.out.println("Opção inválida!");
                    break;
            }
        }while(opcao!=4);

        scanner.close();
        

        




    }


}
