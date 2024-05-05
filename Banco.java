import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int conta, escolha;
        String nome;
        double sacar, depositar, saldo;

        System.out.println("Digite seu nome: ");
        nome = input.nextLine();
        System.out.println("Digite o número da conta: ");
        numeroConta = input.nextInt();
        System.out.println("Digite o saldo inicial da conta: ");
        saldo = input.nextDouble();

        do {
            System.out.println("1-Depositar valor");
            System.out.println("2-Sacar valor");
            System.out.println("3-Saldo disponível");
            System.out.println("4-Sair");
            System.out.print("Digite sua escolha: ");
            escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite o valor a ser depositado: ");
                    depositar = input.nextDouble();
                    Deposito deposito = new Deposito(saldo, depositar);
                    deposito.depositado();
                    saldo += depositar;
                    break;
                case 2:
                    System.out.println("Digite o valor a ser sacaado: ");
                    sacar = input.nextDouble();
                    if (sacar > 5000) {
                        System.out.println("Quantia acima do permitido ");
                    } else if (sacar > saldo){
                        System.out.println("Saldo insuficiente");
                    } else {
                        Saque saque = new Saque(saldo, sacar);
                        saque.sacado();
                        saldo -= sacar;
                    }
                    break;
                    System.out.println("Seu saldo é de: " + saldo + "R$");
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        }while(opcao != 4);
        input.close();

        }
    }