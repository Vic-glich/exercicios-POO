package Exer2;

import java.util.Scanner;

public class Menu {
    static Conta c = new Conta();

    public static void main(String[] args) throws Exception {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Informe seu nome: ");
            c.setName(valor.nextLine());
            c.setConta();
            menu();
        }
    }
    
    public static void menu() {
        try (Scanner valor = new Scanner(System.in)) {
            System.out.println("Usuário: "+c.getName()+" / Conta: "+c.getConta());
            System.out.println("Informe uma das seguintes opções\n(1) Saque\n(2) Deposito\n(3)Alterar Nome\n(4) Encerrar");
            String Op = valor.nextLine();
    
            switch (Op) {
                case "1":
                    Saque();
                break;
                case "2":
                    Deposito();
                break;
                case "3":
                    altName();
                break;
                case "4":
                    System.out.println("Encerrando sessão..."); //Não entendi do, por que após isto, vai para o 'Saque...'
                break;
                default:
                    System.out.println("Informe uma das opções acima!");
                    menu();
            }
        }
    }

    public static void Saque() {
        try (Scanner Saq = new Scanner(System.in)) {
            System.out.println("Saldo atual disponivel: "+c.getSaldo());
            if (c.getSaldo() <= 0) {
                System.out.println("Saldo indisponivel para Saque!");
                menu();
            }

            System.out.print("Quanto deseja sacar?\n");
            double sq = Saq.nextDouble();

            if (sq < 0) {
                System.out.println("Valor inválido!");
                menu();
            } else if (sq > c.getSaldo()) {
                System.out.println("Valor maior do que o disponivel!");
                menu();
            }

            c.Saque(sq);
            System.out.println("Valor sacado de R$"+sq+"\nValor atual na conta: "+c.getSaldo());

            menu();
        }
    }

    public static void Deposito() {
        try (Scanner Dep = new Scanner(System.in)) {
            System.out.println("Saldo atual: "+c.getSaldo());

            System.out.print("Quanto deseja depositar?\n");
            double dp = Dep.nextDouble();

            if (dp < 0) {
                System.out.println("Valor inválido!");
                menu();
            }

            c.Deposito(dp);
            System.out.println("Valor depositado de R$"+dp+"\nValor atual na conta: "+c.getSaldo());

            menu();
        }
    }

    public static void altName() {
        try (Scanner Nam = new Scanner(System.in)) {
            System.out.println("Nome de usuário atual: "+c.getName());
            System.out.println("Novo Nome de usuário: ");
            String nName = Nam.nextLine();

            if (nName == c.getName()) {
                System.out.println("Informe um nome diferente para se usar!");
                altName();
            }

            c.setName(nName);
            System.out.println("Nome alterado cmo sucesso!\nNovo nome: "+c.getName());

            menu();
        }
    }
}
