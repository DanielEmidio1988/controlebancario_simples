import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String titularConta = "Daniel Emidio";
        String tipoConta = "Conta Corrente";
        double saldo = 0;
        double valorOperacao = 0;
        int menuOperacao = 0;
        ArrayList<Operacao> extrato = new ArrayList<>();

        System.out.println("*************************");
        System.out.println("Titular da conta: " + titularConta);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("*************************");

        while(menuOperacao != 4){

            System.out.println("""
            \n Informe a opção desejada
            1- Depósito
            2- Saque
            3- Extrato
            4- Sair      
            
            """);

            menuOperacao = leitura.nextInt();

            switch (menuOperacao){
                case 1:
                    System.out.println("Informe o valor de depósito: ");
                    valorOperacao = leitura.nextDouble();
                    saldo += valorOperacao;
                    extrato.add(new Operacao(titularConta, tipoConta, saldo, valorOperacao, "Depósito"));
                    System.out.println("Saldo atualizado!\nValor em conta atualizado para: R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor de saque: ");
                    valorOperacao = leitura.nextDouble();
                    if(valorOperacao > saldo){
                        System.out.println("Você não possui saldo suficiente para esta operação!");
                    }else{
                        saldo -= valorOperacao;
                        extrato.add(new Operacao(titularConta, tipoConta, saldo,-1 * valorOperacao, "Saque"));
                        System.out.println("Saldo atualizado!\nValor em conta atualizado para: R$ " + saldo +"\nValor do saque em: R$ " + valorOperacao);
                    }
                    break;
                case 3:
                    System.out.println("*********Extrato*********");
                    System.out.println(extrato);
                    System.out.println("*************************");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Comando inválido!");
                    break;
            }
        }

        System.out.println("Tenha um ótimo dia!");


    }
}