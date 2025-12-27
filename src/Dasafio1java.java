import java.util.Scanner;

public class Dasafio1java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int opcao = 0;

        System.out.println("Digite seu nome");
        String nome = input.nextLine();
        System.out.println("Digite seu tipo de conta");
        String tipoDeConta = input.nextLine();
        System.out.println("Digite seu Saldo");
        double saldo = input.nextDouble();


        System.out.println("\n-------------------------------------------");
        System.out.println("\nDados da Conta: ");

        System.out.println("\nNome: " + nome);
        System.out.println("Tipo de Conta: " + tipoDeConta);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("\n-------------------------------------------");


        System.out.println("Operações");
        String operacoes = """
                    \nDigite sua opção
                    
                1.Consultar Saldo
                2.Transferir Valor
                3.Receber Valor
                4.Sair
                
                """;
        Scanner ler = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(operacoes);
            opcao = ler.nextInt();


            if (opcao == 1) {
                System.out.println("Seu saldo atual e " + saldo);
            } else if (opcao == 2) {
                System.out.println("Quanto deseja transferir");
                double valor = ler.nextDouble();
                if (valor >= saldo) {
                    System.out.println("nao a saldo suficiente para essa transferencia");
                } else{
                    saldo -= valor;
                    System.out.println("Novo Saldo: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = ler.nextDouble();
                saldo += valor;
                System.out.println("Novo Saldo: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção invalida! tente outra opção");
            }
        }



    }
}
